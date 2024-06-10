package br.com.vilnei;

import br.com.vilnei.dao.CarroDao;
import br.com.vilnei.dao.ICarroDao;
import br.com.vilnei.domain.Carro;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private final ICarroDao carroDao;

    public CarroTest () {
        carroDao = new CarroDao();
    }
    @Test
    public void cadastrar () {

        Carro carro = new Carro();
        carro.setNome("Corsa");
        carro.setModelo("Classic");
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
