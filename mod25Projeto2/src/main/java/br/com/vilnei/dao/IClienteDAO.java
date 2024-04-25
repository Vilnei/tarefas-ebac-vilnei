package br.com.vilnei.dao;

import br.com.vilnei.dao.generic.IGenericDAO;
import br.com.vilnei.domain.Cliente;

/**
 * @author vilnei
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {


    void atualiarDados(Cliente entity, Cliente entityCadastrado);
}
