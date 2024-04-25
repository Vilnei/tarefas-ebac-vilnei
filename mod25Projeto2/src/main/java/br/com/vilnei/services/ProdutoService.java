package br.com.vilnei.services;

import br.com.vilnei.dao.IProdutoDAO;
import br.com.vilnei.domain.Produto;
import br.com.vilnei.services.generic.GenericService;

/**
 * @author vilnei
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
