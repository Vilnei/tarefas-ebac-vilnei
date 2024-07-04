package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.vilnei.domain.jpa.ClienteJpa;

/**
 * @author Vilnei
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
