import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @autor Vilnei M. de Lima
 */

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Vilnei");

		Assertions.assertEquals("Vilnei", cli.getNome());
	}
}
