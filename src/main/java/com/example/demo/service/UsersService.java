package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lukasz Dziedziak on 03.07.2017.
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository UsersRepository;


    public UsersService(UsersRepository UsersRepository) {
        this.UsersRepository = UsersRepository;
    }

    public List<Users> all(){
        return UsersRepository.findAll();
    }

    public Users findUser(Long id){
        return UsersRepository.findOne(id);
    }
//    public void addUser(String username, String password){
//        Users us = new Users();
//        us.setUsername(username);
//        us.setPassword(password);
//        UsersRepository.save(us);
//    }

}
