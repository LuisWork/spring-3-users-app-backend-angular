package com.luiszambrano.backend.usersapp.spring_3_usersapp.services;

import java.util.List;
import java.util.Optional;

import com.luiszambrano.backend.usersapp.spring_3_usersapp.models.entities.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
