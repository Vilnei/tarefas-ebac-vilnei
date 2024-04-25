package br.com.vilnei.services;

import br.com.vilnei.dao.IClienteDAO;
import br.com.vilnei.domain.Cliente;
import br.com.vilnei.services.generic.GenericService;

/**
 * @author vilnei
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
