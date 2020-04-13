package com.example.my_project2.service;


import com.example.my_project2.entity.User;
import com.example.my_project2.interfac.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl{
    @Autowired
    private  UserInterface userInterface;


    @Transactional(readOnly = true)
    public List<User> getUser(){
        return userInterface.findAll();
    }

    @Transactional(readOnly = true)
    public List<User> getUser(String status){
        return userInterface.findByStatus(status);
    }

    @Transactional(readOnly = true)
    public User getUser(Integer id){
        return userInterface.findById(id).get();
    }

    public void setUser(User user) {
        userInterface.save(user);
    }

    public void deleteUser(Integer id) {
        userInterface.deleteById(id);
    }

}