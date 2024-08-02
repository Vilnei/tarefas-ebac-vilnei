package br.com.vilnei.service;

import java.util.List;

import br.com.vilnei.domain.Cliente;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
