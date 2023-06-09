package com.zavala.dao;

import com.zavala.dao.generics.GenericDAO;
import com.zavala.domain.NotaFiscalCab;

public class NotaFiscalCabDao extends GenericDAO<NotaFiscalCab> implements INotaFiscalCabDao {

	public NotaFiscalCabDao() {
		super();
	}
	
	@Override
	public Class<NotaFiscalCab> getTipoClasse() {
		return NotaFiscalCab.class;
	}

	@Override
	public void atualiarDados(NotaFiscalCab entity, NotaFiscalCab entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

}
