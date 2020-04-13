package com.example.my_project2.controlers;

import com.example.my_project2.entity.Records;
import com.example.my_project2.service.ServicesServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicesServiceController {
    @Autowired
    private  ServicesServiceImpl ServicesService;


    @GetMapping(value = "/getServices")
    public ResponseEntity<Services> getservices(){
        return new ResponseEntity(ServicesService.getservices(), HttpStatus.OK);
    }

}
