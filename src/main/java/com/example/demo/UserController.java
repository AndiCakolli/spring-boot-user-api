package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping("/users")
    public List<User> addUsers(@RequestBody List<User> users) {
    this.users.addAll(users); 
    return users;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return users; // Return the list of users as JSON
    }
}
