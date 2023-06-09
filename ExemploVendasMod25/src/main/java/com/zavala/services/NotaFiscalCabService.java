package com.zavala.services;

import com.zavala.dao.INotaFiscalCabDao;
import com.zavala.domain.NotaFiscalCab;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class NotaFiscalCabService implements INotaFiscalCabService {

	private INotaFiscalCabDao notaFiscalCabDao;
	
	public NotaFiscalCabService(INotaFiscalCabDao notaFiscalCabDao) {
		this.notaFiscalCabDao = notaFiscalCabDao;
	}
	
	@Override
	public Boolean salvar(NotaFiscalCab notaFiscalCab) throws TipoChaveNaoEncontradaException {
		return notaFiscalCabDao.cadastrar(notaFiscalCab);
	}

	@Override
	public NotaFiscalCab buscarPorCodigo(Long numeroNF) {
		return notaFiscalCabDao.consultar(numeroNF);
	}

	@Override
	public Boolean excluir(Long numeroNF) {
		return notaFiscalCabDao.excluir(numeroNF);
	}

	@Override
	public void alterar(NotaFiscalCab notaFiscalCab) throws TipoChaveNaoEncontradaException {
		notaFiscalCabDao.alterar(notaFiscalCab);
	}

}
