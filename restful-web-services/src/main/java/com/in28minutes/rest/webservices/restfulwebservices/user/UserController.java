package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService service;
    public UserController(UserDaoService service) {
        this.service = service;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return service.findAll();
    }
}
