package br.com.vilnei.EBAC.controladores;

import br.com.vilnei.EBAC.entidades.Animal;
import br.com.vilnei.EBAC.repositorios.AnimalRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalControlador {

    private AnimalRepositorio repositorio;

    public AnimalControlador ( AnimalRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping
    private List<Animal> findAll() {
        return repositorio.findAll();
    }

    @PostMapping
    private Animal create (@RequestBody Animal animal) {
        return repositorio.save(animal);
    }

    @GetMapping("/encontrar-nao-adotados")
    private List<Animal> encontrarNaoAdotados() {
        return repositorio.encontrarNaoAdotados();
    }

    @GetMapping("/encontrar-adotados")
    private List<Animal> encontrarAdotados() {
        return repositorio.encontrarAdotados();
    }
}
