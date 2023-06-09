/**
 * 
 */
package com.zavala.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.zavala.dao.IClienteDao;
import com.zavala.domain.Cliente;
import com.zavala.exception.TipoChaveNaoEncontradaException;
import com.zavala.test.dao.ClienteDaoMock;

/**
 * @author Ramiro
 *
 */
public class ClienteDaoTest {

	private IClienteDao clienteDao;
	private Cliente cliente;
	
	public ClienteDaoTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		//antes de todos os testes, executa este método
		cliente = new Cliente();
		cliente.setCpf(12345678901L);
		cliente.setNome("Ramiro");
		cliente.setCidade("Recife");
		cliente.setEstado("Pernambuco");
		cliente.setEnd("Boa Viagem");
		cliente.setNumeroEnd(561);
		cliente.setTel(81989264848L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Ramiro Arce Zavala");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Ramiro Arce Zavala",cliente.getNome());
	}
	
}
