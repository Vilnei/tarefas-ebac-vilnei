package br.com.vilnei.dao;

import java.util.List;

import br.com.vilnei.dao.generic.IGenericDAO;
import br.com.vilnei.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
