package com.in28minutes.rest.webservices.restfulwebservices.user;
import jakarta.validation.constraints.Size;

public class User {
    private Integer id;
    @Size(min = 2)
    private String name;

    public User(){}

    public  User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
