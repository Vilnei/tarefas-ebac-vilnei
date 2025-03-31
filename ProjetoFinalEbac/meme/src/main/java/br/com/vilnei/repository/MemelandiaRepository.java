package br.com.vilnei.repository;

import br.com.vilnei.entity.Meme;
import org.springframework.data.repository.CrudRepository;

public interface MemelandiaRepository extends CrudRepository<Meme, Long> {
}
