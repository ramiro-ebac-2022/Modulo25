package com.zavala.services;

import com.zavala.domain.NotaFiscalDet;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public interface INotaFiscalDetService {

	Boolean salvar(NotaFiscalDet notaFiscalDet) throws TipoChaveNaoEncontradaException ;

	NotaFiscalDet buscarPorCodigo(Long numeroNF);

	Boolean excluir(Long numeroNF);

	void alterar(NotaFiscalDet notaFiscalDet) throws TipoChaveNaoEncontradaException ;
}
