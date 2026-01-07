package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Tong Thanh"));
        users.add(new User(2, "Dieu Linh"));

    }
    public List<User> findAll(){
        return users;
    }
}
