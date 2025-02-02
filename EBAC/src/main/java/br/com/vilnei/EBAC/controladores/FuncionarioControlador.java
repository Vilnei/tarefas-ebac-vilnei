package br.com.vilnei.EBAC.controladores;

import br.com.vilnei.EBAC.entidades.Funcionario;
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

//    @GetMapping("/funcionario-ativo")
//    private List<Funcionario> ativo() {
//        return repositorio.ativo();
//    }

//    @GetMapping("/funcionario-desativo")
//    private List<Funcionario> desativo() {
//        return repositorio.desativo();
//    }

}
