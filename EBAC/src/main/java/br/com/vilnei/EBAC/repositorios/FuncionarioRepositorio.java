package br.com.vilnei.EBAC.repositorios;

import br.com.vilnei.EBAC.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, String> {
//    @Query("SELECT a FROM funcionario a WHERE a.Demissao IS NULL")
//    List<Funcionario> ativo();

//    @Query("SELECT a FROM funcionario a WHERE a.demissao IS NOT NULL")
//    List<Funcionario> desativo();
}
