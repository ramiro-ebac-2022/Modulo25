package com.zavala.services;

import com.zavala.domain.NotaFiscalCab;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public interface INotaFiscalCabService {

	Boolean salvar(NotaFiscalCab notaFiscalCab) throws TipoChaveNaoEncontradaException ;

	NotaFiscalCab buscarPorCodigo(Long numeroNF);

	Boolean excluir(Long numeroNF);

	void alterar(NotaFiscalCab notaFiscalCab) throws TipoChaveNaoEncontradaException ;
}
