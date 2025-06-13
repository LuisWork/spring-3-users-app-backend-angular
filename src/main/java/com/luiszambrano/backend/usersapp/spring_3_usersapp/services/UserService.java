package com.luiszambrano.backend.usersapp.spring_3_usersapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.luiszambrano.backend.usersapp.spring_3_usersapp.models.entities.User;
import com.luiszambrano.backend.usersapp.spring_3_usersapp.models.entities.UserRequest;

public interface UserService {

    List<User> findAll();

    Page<User> findAll(Pageable pageable);

    Optional<User> findById(Long id);

    User save(User user);

    Optional<User> update(UserRequest user, Long id);

    void deleteById(Long id);

}
