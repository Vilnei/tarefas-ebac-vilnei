package br.com.vilnei.SpringBootPrimeiroExemploEBAC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.vilnei.domain.Cliente;
import br.com.vilnei.repository.IClienteRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.vilnei.repository")
@EntityScan("br.com.vilnei.*")
@ComponentScan(basePackages = "br.com.vilnei")
public class SpringBootPrimeiroExemploEbacApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootPrimeiroExemploEbacApplication.class);

	@Autowired
	private IClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemploEbacApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("Jataí")
				.cpf(12312312310L)
				.email("Teste@teste.com")
				.end("End")
				.estado("GO")
				.nome("Teste Spring Boot")
				.numero(102030)
				.tel(10203040L)
				.build();
	}

}