package br.com.vilnei.service;

import br.com.vilnei.entity.Users;
import br.com.vilnei.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<Users> findThemAll() {
        return userRepo.findAll();
    }

    public Users createUsers(Users users) {
        return userRepo.save(users);
    }

    public Users findById(Long id) {
        Optional<Users> usersOptional = userRepo.findById(id);
        if (usersOptional.isPresent()) {
            return usersOptional.get();
        } else {
            throw new RuntimeException(" //////////// User not found! //////////// ");
        }
    }
}
