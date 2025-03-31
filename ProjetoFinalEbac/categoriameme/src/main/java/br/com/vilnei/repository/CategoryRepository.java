package br.com.vilnei.repository;

import br.com.vilnei.entity.CategoryMeme;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryMeme, Long> {
}
