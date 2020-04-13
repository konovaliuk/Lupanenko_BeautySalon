package com.example.my_project2.interfac;

import com.example.my_project2.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserInterface {

    List<User> findByStatus(String status);
    Optional<User> findById(Integer id);
    List<User> findAll();

    void deleteById(Integer id);
    void save(User user);
}
