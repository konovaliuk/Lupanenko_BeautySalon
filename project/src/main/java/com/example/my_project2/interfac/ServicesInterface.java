package com.example.my_project2.interfac;

import com.example.my_project2.entity.Services;

import java.util.List;

public interface ServicesInterface {

    List<Services> findByPrice(Integer price);
    List<Services> findAll();
}
