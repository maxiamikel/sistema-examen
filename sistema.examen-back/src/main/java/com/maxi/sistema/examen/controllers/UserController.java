package com.maxi.sistema.examen.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.sistema.examen.entities.Role;
import com.maxi.sistema.examen.entities.User;
import com.maxi.sistema.examen.entities.UserRole;
import com.maxi.sistema.examen.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public User createUser(@RequestBody User obj) throws Exception{

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(2L);
        role.setNome("USER_COMUN");

        UserRole userRole = new UserRole();
        userRole.setRole(role);
        userRole.setUser(obj);

        return userService.saveUser(obj, roles);
    }
    
    @GetMapping("/")
    public List<User> findAllUsers(){
        return this.userService.findAll();
    }

    @GetMapping("/{username}")
    public User findUserByNome(@PathVariable("username") String username){
        return userService.findUserByNome(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUserId(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }
}
