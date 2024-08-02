package br.com.vilnei.dao;

import java.util.List;

import br.com.vilnei.dao.generic.IGenericDAO;
import br.com.vilnei.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
