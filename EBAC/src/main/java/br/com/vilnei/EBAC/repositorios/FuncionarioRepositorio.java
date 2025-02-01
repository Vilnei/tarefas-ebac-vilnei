package br.com.vilnei.EBAC.repositorios;

import br.com.vilnei.EBAC.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, String> {
    @Query("SELECT a FROM funcionario a WHERE a.nomeRecebedor ...?????")
    List<Funcionario> funcionarioRecebedor();
}
