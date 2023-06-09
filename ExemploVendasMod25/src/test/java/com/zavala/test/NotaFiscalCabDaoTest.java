package com.zavala.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.zavala.dao.INotaFiscalCabDao;
import com.zavala.domain.NotaFiscalCab;
import com.zavala.exception.TipoChaveNaoEncontradaException;
import com.zavala.test.dao.NotaFiscalCabDaoMock;

public class NotaFiscalCabDaoTest {

	private INotaFiscalCabDao notaFiscalCabDao;
	private NotaFiscalCab notaFiscalCab;
	
	public NotaFiscalCabDaoTest() {
		notaFiscalCabDao = new NotaFiscalCabDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		notaFiscalCab = new NotaFiscalCab();
		notaFiscalCab.setClienteNF("Cliente da nota fiscal");
		notaFiscalCab.setDescricaoNF("Descrição da nota fiscal");
		notaFiscalCab.setNumeroNF(111L);
		notaFiscalCab.setValorNF(123.45);
		notaFiscalCab.setDataNF(new Date());
		notaFiscalCabDao.cadastrar(notaFiscalCab);
	}
	
	@Test
	public void pesquisarNotaFiscal() {
		NotaFiscalCab notaFiscalCabPesquisado = notaFiscalCabDao.consultar(notaFiscalCab.getNumeroNF());
		Assert.assertNotNull(notaFiscalCabPesquisado);
	}
	
	@Test
	public void salvaNotaFiscal() throws TipoChaveNaoEncontradaException {
		Boolean retorno = notaFiscalCabDao.cadastrar(notaFiscalCab);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirNotaFiscal() {
		Boolean retorno = notaFiscalCabDao.excluir(notaFiscalCab.getNumeroNF());
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void alterarNotaFiscal() throws TipoChaveNaoEncontradaException {
		notaFiscalCab.setClienteNF("Terceiro cliente da nota fiscal");
		notaFiscalCabDao.alterar(notaFiscalCab);
		Assert.assertEquals("Terceiro cliente da nota fiscal", notaFiscalCab.getClienteNF());
	}
	
	
}
