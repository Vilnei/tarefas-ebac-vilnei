package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.IGenericJapDAO;
import br.com.vilnei.domain.jpa.VendaJpa;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	public VendaJpa consultarComCollection(Long id);
}
