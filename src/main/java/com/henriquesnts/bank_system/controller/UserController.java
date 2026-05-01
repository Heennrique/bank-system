package com.henriquesnts.bank_system.controller;

import com.henriquesnts.bank_system.model.User;
import com.henriquesnts.bank_system.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User salvar (@RequestBody User user){
        System.out.println("Cliente Cadastrado" + user);

        var id =UUID.randomUUID().toString();
        user.setId(id);

        userRepository.save(user);
        return user;

    }

    @GetMapping("/{id}")
    public User buscarID (@PathVariable("id")String id) {
     return userRepository.findById(id).orElse(null);

    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable("id")String id){
        userRepository.deleteById(id);
    }
}
