package com.maxi.sistema.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.sistema.examen.entities.Role;

public interface RoleRepository extends JpaRepository <Role, Long> {
    
}
