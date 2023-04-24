package com.maxi.sistema.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.sistema.examen.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    public User findByUserName(String userName);
}
