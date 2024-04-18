package main.service;

import main.dao.IContratoDao;

/**
 * @author Vilnei M. de Lima
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Salvo com sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca concluida com sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Exclusão concluida com sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atulaização concluida com sucesso";
    }
}
