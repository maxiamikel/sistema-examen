package com.maxi.sistema.examen.services.implementations;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.sistema.examen.entities.User;
import com.maxi.sistema.examen.entities.UserRole;
import com.maxi.sistema.examen.repositories.RoleRepository;
import com.maxi.sistema.examen.repositories.UserRepository;
import com.maxi.sistema.examen.services.UserService;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Override
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
        User newUser = userRepo.findByUserName(user.getUserName());
        if(newUser != null){
            System.out.println("O usuario informado já existe");
            throw new Exception("Não é permitido repetir mesmo nome de usuario no sistema");
        }else{
            for(UserRole userRole:userRoles){
                roleRepo.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            newUser = userRepo.save(user);
        }

        return newUser;
    }

    @Override
    public User findUserByNome(String nome) {
       return this.userRepo.findByUserName(nome);
    }

    @Override
    public void deleteUserById(Long id) {
        this.userRepo.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return this.userRepo.findAll();
    }
    
}
