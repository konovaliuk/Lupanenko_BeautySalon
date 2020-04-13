package com.example.my_project2.controlers;

import com.example.my_project2.entity.User;
import com.example.my_project2.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserServiceController {
    @Autowired
    private  UserServiceImpl userService;


    @GetMapping(value = "/user")
    public ResponseEntity<User> getUser(){

        return new ResponseEntity(userService.getUser(), HttpStatus.OK);
    }

    @GetMapping(value = "/user/byStatus/{status}")
    public ResponseEntity<User> getUser(@PathVariable String status){
        return new ResponseEntity(userService.getUser(status), HttpStatus.OK);
    }

    @GetMapping(value = "/user/byId/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return new ResponseEntity(userService.getUser(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PostMapping(value = "/user/save")
    public ResponseEntity<Object> setUser(@RequestBody User users){
        userService.setUser(users);
        return new ResponseEntity<>("Add", HttpStatus.CREATED);
    }

    @PutMapping(value = "/user/save")
    public ResponseEntity<Object> updateUser(@RequestBody User users){
        userService.setUser(users);
        return new ResponseEntity<>("Update", HttpStatus.OK);
    }




}