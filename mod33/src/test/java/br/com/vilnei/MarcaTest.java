package br.com.vilnei;

import br.com.vilnei.dao.IMarcaDao;
import br.com.vilnei.dao.MarcaDao;
import br.com.vilnei.domain.Marca;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private final IMarcaDao marcaDao;

    public MarcaTest () {
        marcaDao = new MarcaDao();
    }
    @Test
    public void cadastrar() {

        Marca marca = new Marca();
        marca.setCodigo("Teste01");
        marca.setNome("Chevrolet");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
