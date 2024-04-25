package br.com.vilnei.dao;

import br.com.vilnei.domain.Cliente;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
}
