package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.vilnei.domain.jpa.ClienteJpa2;

/**
 * @author Vilnei
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
