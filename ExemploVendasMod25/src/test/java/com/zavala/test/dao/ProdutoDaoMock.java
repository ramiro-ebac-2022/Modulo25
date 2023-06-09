package com.zavala.test.dao;

import java.util.Collection;

import com.zavala.dao.IProdutoDao;
import com.zavala.domain.Produto;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class ProdutoDaoMock implements IProdutoDao {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		return true;
	}

	@Override
	public Boolean excluir(Long valor) {
		return true;
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
	}

	@Override
	public Produto consultar(Long valor) {
		Produto produto = new Produto();
		produto.setCodigo(valor);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		return null;
	}

}
