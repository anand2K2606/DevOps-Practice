package com.example.sampleapi.controller;

import com.example.sampleapi.model.User;
import com.example.sampleapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        boolean deleted = userService.deleteUser(id);
        return deleted ? "User deleted successfully" : "User not found";
    }
}