package br.com.vilnei.EBAC.controladores;

import br.com.vilnei.EBAC.entidades.Funcionario;
import br.com.vilnei.EBAC.repositorios.AnimalRepositorio;
import br.com.vilnei.EBAC.repositorios.FuncionarioRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControlador {

    private FuncionarioRepositorio repositorio;

    public FuncionarioControlador (FuncionarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping
    private List<Funcionario> findAll () {
        return repositorio.findAll();
    }

    @GetMapping("/funcionario-recebedor")
    private List<Funcionario> funcionarioRecebedor() {
        return repositorio.funcionarioRecebedor();
    }

}
