package br.com.vilnei.dao;

import br.com.vilnei.dao.generic.IGenericDAO;
import br.com.vilnei.domain.Venda;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author vilnei
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
