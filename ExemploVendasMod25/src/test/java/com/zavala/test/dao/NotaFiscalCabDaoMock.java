package com.zavala.test.dao;

import java.util.Collection;

import com.zavala.dao.INotaFiscalCabDao;
import com.zavala.domain.NotaFiscalCab;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class NotaFiscalCabDaoMock implements INotaFiscalCabDao{

	@Override
	public Boolean cadastrar(NotaFiscalCab entity) throws TipoChaveNaoEncontradaException {
		return true;
	}

	@Override
	public Boolean excluir(Long valor) {
		return true;
	}

	@Override
	public void alterar(NotaFiscalCab entity) throws TipoChaveNaoEncontradaException {
	}

	@Override
	public NotaFiscalCab consultar(Long valor) {
		NotaFiscalCab notaFiscalCab = new NotaFiscalCab();
		notaFiscalCab.setNumeroNF(valor);
		return notaFiscalCab;
	}

	@Override
	public Collection<NotaFiscalCab> buscarTodos() {
		return null;
	}

}
