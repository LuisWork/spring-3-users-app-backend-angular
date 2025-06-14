package com.luiszambrano.backend.usersapp.spring_3_usersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luiszambrano.backend.usersapp.spring_3_usersapp.models.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
