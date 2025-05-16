package com.luiszambrano.backend.usersapp.spring_3_usersapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.luiszambrano.backend.usersapp.spring_3_usersapp.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
