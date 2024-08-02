package br.com.vilnei.service;

import java.util.List;

import br.com.vilnei.domain.Produto;
import br.com.vilnei.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
