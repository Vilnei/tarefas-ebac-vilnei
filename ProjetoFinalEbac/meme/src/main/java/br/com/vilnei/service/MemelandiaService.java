package br.com.vilnei.service;

import br.com.vilnei.entity.Meme;
import br.com.vilnei.repository.MemelandiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemelandiaService {
    @Autowired
    private final MemelandiaRepository memelandiaRepository;

    public MemelandiaService(MemelandiaRepository memelandiaRepository) {
        this.memelandiaRepository = memelandiaRepository;
    }

    public Meme criarMeme(Meme meme) {
        return memelandiaRepository.save(meme);
    }

    public Iterable<Meme> findAllMemes() {
        return memelandiaRepository.findAll();
    }
}
