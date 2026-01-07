package com.in28minutes.rest.webservices.restfulwebservices.user;

public class User {
    private Integer id;
    private String name;

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
