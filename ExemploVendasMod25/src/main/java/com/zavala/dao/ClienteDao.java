package com.zavala.dao;

import com.zavala.dao.generics.GenericDAO;
import com.zavala.domain.Cliente;

public class ClienteDao extends GenericDAO<Cliente> implements IClienteDao {

	public ClienteDao() {
		super();
	}
	
	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}


}
