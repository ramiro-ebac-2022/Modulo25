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
import com.zavala.services.ClienteService;
import com.zavala.services.IClienteService;
import com.zavala.test.dao.ClienteDaoMock;

/**
 * @author Ramiro
 * Sistema para simular uma venda : Nota Fiscal , Cliente , Produto.
 * Camada de banco : padrão FACADE : IClienteService
 *
 */
public class ClienteServiceTest {

	private IClienteService clienteService;
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDao dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
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
		clienteService.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Ramiro Arce Zavala");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Ramiro Arce Zavala",cliente.getNome());
	}
	
}
