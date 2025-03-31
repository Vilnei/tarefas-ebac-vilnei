package br.com.vilnei.repository;

import br.com.vilnei.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
