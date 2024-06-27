package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.GenericJpaDAO;
import br.com.vilnei.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
