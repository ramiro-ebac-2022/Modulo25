package com.zavala.services;

import com.zavala.domain.Cliente;
import com.zavala.exception.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException ;

	Cliente buscarPorCpf(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException ;

}
