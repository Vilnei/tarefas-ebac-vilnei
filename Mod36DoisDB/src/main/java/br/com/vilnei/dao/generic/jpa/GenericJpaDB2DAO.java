package br.com.vilnei.dao.generic.jpa;

import java.io.Serializable;

import br.com.vilnei.domain.jpa.Persistente;

/**
 * @author Vilnei
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
