import main.dao.ClienteDao;
import main.dao.ClienteDaoMock;
import main.dao.IClienteDao;
import main.service.ClienteService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 * @author Vilnei M. de Lima
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }
}
