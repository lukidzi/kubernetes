package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class MyRestController {


    @Autowired
    private UsersService UsersService;

    public MyRestController(UsersService UsersService) {
        this.UsersService = UsersService;
    }

    @GetMapping("/{name}")
    public String grettings(@PathVariable String name){

        return "Hello : " + name ;
    }

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        List<Users> list = UsersService.all();

        return list;
    }
    @GetMapping("/hostname")
    public String getHostname(){
        return System.getenv().getOrDefault("HOSTNAME", "unknown");
    }

    @GetMapping("/users/{id}")
    public Users getUser(@PathVariable Long id){
        Users user  = UsersService.findUser(id);
        return user;
    }

}
