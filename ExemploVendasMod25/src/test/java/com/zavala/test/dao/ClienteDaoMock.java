package com.zavala.test.dao;

import java.util.Collection;

import com.zavala.dao.IClienteDao;
import com.zavala.domain.Cliente;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDao {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		return true;
	}
	
	@Override
	public Boolean excluir(Long valor) {
		return true;
		
	}
	
	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}
	
	@Override
	public Collection<Cliente> buscarTodos() {
		return null;
	}
	
}
