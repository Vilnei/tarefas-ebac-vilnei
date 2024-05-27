package br.com.vilnei.generic;

import br.com.vilnei.dao.Persistente;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.exceptions.MaisDeUmRegistroException;
import br.com.vilnei.exceptions.TableException;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    public void excluir(E valor) throws DAOException, DAOException;
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;
    public Collection<T> buscarTodos() throws DAOException;

}
