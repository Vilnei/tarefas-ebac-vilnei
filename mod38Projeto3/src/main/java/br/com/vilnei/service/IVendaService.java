package br.com.vilnei.service;

import br.com.vilnei.dao.generic.IGenericDAO;
import br.com.vilnei.domain.Venda;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);

}
