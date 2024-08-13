package br.com.vilnei.vendas.online.usecase;

import javax.validation.Valid;

import br.com.vilnei.vendas.online.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vilnei.vendas.online.domain.Cliente;

@Service
public class CadastroCliente {
	
	private IClienteRepository clienteRepository;
	
	@Autowired
	public CadastroCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return this.clienteRepository.insert(cliente);
	}

	public Cliente atualizar(@Valid Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
