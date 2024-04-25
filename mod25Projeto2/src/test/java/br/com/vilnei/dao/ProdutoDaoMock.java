package br.com.vilnei.dao;

import br.com.vilnei.domain.Produto;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ProdutoDaoMock implements IProdutoDAO {
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return List.of();
    }
}
