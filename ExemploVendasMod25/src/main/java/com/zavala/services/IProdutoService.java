package com.zavala.services;

import com.zavala.domain.Produto;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public interface IProdutoService {

	Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException ;

	Produto buscarPorCodigo(Long codigo);

	Boolean excluir(Long codigo);

	void alterar(Produto produto) throws TipoChaveNaoEncontradaException ;
	
}
