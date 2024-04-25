package br.com.vilnei;

import br.com.vilnei.dao.ClienteDaoMock;
import br.com.vilnei.dao.IClienteDAO;
import br.com.vilnei.domain.Cliente;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;
import br.com.vilnei.services.ClienteService;
import br.com.vilnei.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vilnei
 */
public class ClienteServiceTest {
	
	private final IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Vilnei");
		cliente.setCidade("Jatai");
		cliente.setEnd("End");
		cliente.setEstado("GO");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		Assert.assertNull(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Vilnei");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Vilnei", cliente.getNome());
	}
}
