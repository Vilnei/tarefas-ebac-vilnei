package br.com.vilnei;

import br.com.vilnei.dao.IProdutoDao;
import br.com.vilnei.dao.ProdutoDao;
import br.com.vilnei.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A3");
        produto.setNome("shampoo");
        produto.setValor(10d);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
