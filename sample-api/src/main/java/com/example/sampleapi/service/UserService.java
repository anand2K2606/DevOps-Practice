package com.example.sampleapi.service;

import com.example.sampleapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    // Constructor → Hardcoded data
    public UserService() {
        users.add(new User(1, "John", "john@example.com"));
        users.add(new User(2, "Alice", "alice@example.com"));
        users.add(new User(3, "Anand", "anand@example.com"));
    }

    // CREATE
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    // READ ALL
    public List<User> getAllUsers() {
        return users;
    }

    // READ BY ID
    public User getUserById(int id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        return user.orElse(null);
    }

    // UPDATE
    public User updateUser(int id, User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}