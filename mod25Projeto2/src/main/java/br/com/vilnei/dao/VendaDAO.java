package br.com.vilnei.dao;

import br.com.vilnei.dao.generic.GenericDAO;
import br.com.vilnei.domain.Venda;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author vilnei
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Venda.Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
