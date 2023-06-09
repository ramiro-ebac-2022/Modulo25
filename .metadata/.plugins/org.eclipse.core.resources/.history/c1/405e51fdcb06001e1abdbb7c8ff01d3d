package com.zavala.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.zavala.dao.INotaFiscalCabDao;
import com.zavala.domain.NotaFiscalCab;
import com.zavala.exception.TipoChaveNaoEncontradaException;
import com.zavala.services.INotaFiscalCabService;
import com.zavala.services.NotaFiscalCabService;
import com.zavala.test.dao.NotaFiscalCabDaoMock;

public class NotaFiscalCabServiceTest {

	private INotaFiscalCabService notaFiscalCabService;
	private NotaFiscalCab notaFiscalCab;
	
	public NotaFiscalCabServiceTest() {
		INotaFiscalCabDao dao = new NotaFiscalCabDaoMock();
		notaFiscalCabService = new NotaFiscalCabService(dao);
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		notaFiscalCab = new NotaFiscalCab();
		notaFiscalCab.setClienteNF("Cliente da nota fiscal");
		notaFiscalCab.setDescricaoNF("Descrição da nota fiscal");
		notaFiscalCab.setNumeroNF(111L);
		notaFiscalCab.setValorNF(123.45);
		notaFiscalCab.setDataNF(new Date());
		notaFiscalCabService.salvar(notaFiscalCab);
	}
	
	@Test
	public void pesquisarNotaFiscal() {
		NotaFiscalCab notaFiscalCabPesquisado = notaFiscalCabService.buscarPorCodigo(notaFiscalCab.getNumeroNF());
		Assert.assertNotNull(notaFiscalCabPesquisado);
	}
	
	@Test
	public void salvaNotaFiscal() throws TipoChaveNaoEncontradaException {
		Boolean retorno = notaFiscalCabService.salvar(notaFiscalCab);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirNotaFiscal() {
		Boolean retorno = notaFiscalCabService.excluir(notaFiscalCab.getNumeroNF());
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void alterarNotaFiscal() throws TipoChaveNaoEncontradaException {
		notaFiscalCab.setClienteNF("Segundo cliente da nota fiscal");
		notaFiscalCabService.alterar(notaFiscalCab);
		Assert.assertEquals("Segundo cliente da nota fiscal", notaFiscalCab.getClienteNF());
	}
	
}
