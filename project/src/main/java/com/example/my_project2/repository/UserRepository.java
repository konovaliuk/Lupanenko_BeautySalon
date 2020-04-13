package com.example.my_project2.repository;

import com.example.my_project2.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {
   public List<User> findByStatus(String status);
}

