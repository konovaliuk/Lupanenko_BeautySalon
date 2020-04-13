package com.example.my_project2.service;


import com.example.my_project2.entity.Services;
import com.example.my_project2.entity.Records;
import com.example.my_project2.interfac.ServicesInterface;
import com.example.my_project2.interfac.RecordsInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicesServiceImpl {

    @Autowired
    private ServicesInterface servicesInterface;

    @Transactional(readOnly = true)
    public List<Services> getServs(){
        return servicesInterface.findAll();
    }

    @Transactional(readOnly = true)
    public List<Services> getServ(Integer price){
        return servicesInterface.findByPrice(price);
    }
}
