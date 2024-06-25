package com.primeirospring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeirospring.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
