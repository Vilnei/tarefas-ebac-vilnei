package br.com.vilnei.dao.jpa;

import br.com.vilnei.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.vilnei.domain.jpa.ProdutoJpa;

/**
 * @author Vilnei
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
