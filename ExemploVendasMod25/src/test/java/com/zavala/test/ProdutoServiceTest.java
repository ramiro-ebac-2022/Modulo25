package com.zavala.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.zavala.dao.IProdutoDao;
import com.zavala.domain.Produto;
import com.zavala.exception.TipoChaveNaoEncontradaException;
import com.zavala.services.IProdutoService;
import com.zavala.services.ProdutoService;
import com.zavala.test.dao.ProdutoDaoMock;

public class ProdutoServiceTest {

	private IProdutoService produtoService;
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDao dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo(123L);
		produto.setDescricao("Produto teste");
		produto.setUnidadeMedida("Unidade");
		produto.setValorUnitario(12.35);
		produtoService.salvar(produto);
	}
	
	@Test
	public void pesquisarProduto() {
		Produto produtoConsultado = produtoService.buscarPorCodigo(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void salvarProduto() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.salvar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirProduto() {
		Boolean retorno = produtoService.excluir(produto.getCodigo());
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void alterarProduto() throws TipoChaveNaoEncontradaException {
		produto.setDescricao("Produto teste versão 2");
		produtoService.alterar(produto);
		Assert.assertEquals("Produto teste versão 2", produto.getDescricao());
	}
	
}