package br.com.vilnei;

import br.com.vilnei.dao.AcessorioDao;
import br.com.vilnei.dao.IAcessorioDao;
import br.com.vilnei.domain.Acessorio;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AcessorioTest {

    private final IAcessorioDao acessorioDao;

    public AcessorioTest () {
        acessorioDao = new AcessorioDao();
    }
    @Test
    public void cadastrar() {

        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("Teste01");
        acessorio.setNome("banco de couro");
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
