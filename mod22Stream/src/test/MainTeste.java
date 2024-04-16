import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTeste {
    List<Pessoa> lista = new Pessoa().criarPessoas();

    @Test
    public void testeListaSoComSexoFeminino () {
        List<Pessoa> listaFeminina = lista.stream().filter(feminino -> feminino.getSexo().equals("F")).toList();
        Assertions.assertEquals("F", listaFeminina.get(1).getSexo());

    }
    @Test
    public void testeListaSoComSexoMasculino () {
        List<Pessoa> listaMasculina = lista.stream().filter(masculino -> masculino.getSexo().equals("M")).toList();
        Assertions.assertEquals("M", listaMasculina.get(0).getSexo());
    }
    @Test
    public void testeListaParaConferirId () {
        Assertions.assertEquals(4, lista.get(3).getId());
    }
}
