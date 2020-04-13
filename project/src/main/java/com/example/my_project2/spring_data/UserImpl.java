package com.example.my_project2.spring_data;

import com.example.my_project2.entity.User;
import com.example.my_project2.interfac.UserInterface;
import com.example.my_project2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository("UserRepository")
@Transactional
@AllArgsConstructor

public class UserImpl implements UserInterface {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findByStatus(String status) {
        return userRepository.findByStatus(status);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}