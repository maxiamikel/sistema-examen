package com.maxi.sistema.examen.services;

import java.util.List;
import java.util.Set;

import com.maxi.sistema.examen.entities.User;
import com.maxi.sistema.examen.entities.UserRole;

public interface UserService {
    
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception;

    public User findUserByNome(String nome);

    public void deleteUserById(Long id);

    public List<User> findAll();
}
