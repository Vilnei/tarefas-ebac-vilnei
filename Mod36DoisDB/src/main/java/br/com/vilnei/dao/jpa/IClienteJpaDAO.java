package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.IGenericJapDAO;
import br.com.vilnei.domain.jpa.Persistente;

/**
 * @author Vilnei
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
