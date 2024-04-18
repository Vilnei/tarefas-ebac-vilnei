package main.dao;

/**
 * @author Vilnei M. de Lima
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona por não ter Banco de Dados");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não funciona por não ter Banco de Dados");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona por não ter Banco de Dados");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não funciona por não ter Banco de Dados");
    }
}
