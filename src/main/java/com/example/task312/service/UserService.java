package com.example.task312.service;

import com.example.task312.model.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(Integer id);

}
