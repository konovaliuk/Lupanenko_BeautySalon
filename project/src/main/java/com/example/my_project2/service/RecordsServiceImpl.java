package com.example.my_project2.service;


import com.example.my_project2.entity.Records;
import com.example.my_project2.interfac.RecordsTableInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class RecordsServiceImpl {

    @Autowired
    private RecordsInterface recordsInterface;

    @Transactional(readOnly = true)
    public List<Records> getRecords(){
        return recordsInterface.findAll();
    }

    @Transactional(readOnly = true)
    public List<Records> getRecords(Timestamp date){
        return recordsInterface.findByDate(date);
    }
}
