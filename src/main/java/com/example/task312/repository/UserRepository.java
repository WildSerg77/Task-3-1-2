package com.example.task312.repository;

import com.example.task312.model.User;
import java.util.List;

public interface UserRepository {
    User findById(Integer id);
    List<User> findAll();
    void save(User user);
    void deleteById(Integer id);



}
