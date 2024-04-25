package br.com.vilnei.services;

import br.com.vilnei.domain.Cliente;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author vilnei
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
