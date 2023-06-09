package com.zavala.test.dao;

import java.util.Collection;

import com.zavala.dao.INotaFiscalDetDao;
import com.zavala.domain.NotaFiscalDet;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class NotaFiscalDetDaoMock implements INotaFiscalDetDao {

	@Override
	public Boolean cadastrar(NotaFiscalDet entity) throws TipoChaveNaoEncontradaException {
		return true;
	}

	@Override
	public Boolean excluir(Long valor) {
		return true;
	}

	@Override
	public void alterar(NotaFiscalDet entity) throws TipoChaveNaoEncontradaException {
	}

	@Override
	public NotaFiscalDet consultar(Long valor) {
		NotaFiscalDet notaFiscalDet = new NotaFiscalDet();
		notaFiscalDet.setNumeroNF(valor);
		return notaFiscalDet;
	}

	@Override
	public Collection<NotaFiscalDet> buscarTodos() {
		return null;
	}

}
