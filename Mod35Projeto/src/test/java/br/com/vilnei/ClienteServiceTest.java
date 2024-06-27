package br.com.vilnei;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.vilnei.dao.ClienteDaoMock;
import br.com.vilnei.dao.IClienteDAO;
import br.com.vilnei.domain.Cliente;
import br.com.vilnei.exceptions.DAOException;
import br.com.vilnei.exceptions.TipoChaveNaoEncontradaException;
import br.com.vilnei.services.ClienteService;
import br.com.vilnei.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
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
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Vilnei Lima");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Vilnei Lima", cliente.getNome());
	}
}
