package br.com.vilnei.dao;

import br.com.vilnei.generic.IGenericDAO;
import br.com.vilnei.domain.Venda;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}