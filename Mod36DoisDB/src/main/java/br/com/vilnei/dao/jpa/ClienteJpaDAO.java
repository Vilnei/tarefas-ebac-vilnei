package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.vilnei.domain.jpa.ClienteJpa;

/**
 * @author Vilnei
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
