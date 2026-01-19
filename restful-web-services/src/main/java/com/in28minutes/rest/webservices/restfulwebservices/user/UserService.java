package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;
    static {
        users.add(new User(++userCount, "Tong Thanh"));
        users.add(new User(++userCount, "Dieu Linh"));

    }
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findOne(Integer id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst().orElse(null);
    }

    public User deleteById(Integer id){
        boolean removed =  users.removeIf(user -> user.getId() == id);
        if(!removed) throw new UserNotFoundException("Id: " + id + " not found");
    }
}
