package com.zavala.services;

import com.zavala.dao.IProdutoDao;
import com.zavala.domain.Produto;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class ProdutoService implements IProdutoService{

	private IProdutoDao produtoDao;
	
	public ProdutoService(IProdutoDao produtoDao) {
		this.produtoDao = produtoDao;
	}
	
	@Override
	public Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException {
		return produtoDao.cadastrar(produto);
	}

	@Override
	public Produto buscarPorCodigo(Long codigo) {
		return produtoDao.consultar(codigo);
	}

	@Override
	public Boolean excluir(Long codigo) {
		return produtoDao.excluir(codigo);
	}

	@Override
	public void alterar(Produto produto) throws TipoChaveNaoEncontradaException {
		produtoDao.alterar(produto);
	}

}
