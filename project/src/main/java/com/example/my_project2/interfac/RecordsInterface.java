package com.example.my_project2.interf;

import com.example.my_project2.entity.Records;

import java.sql.Timestamp;
import java.util.List;

public interface RecordsInterface {

    List<Records> findByDate(Timestamp date);
    List<Records> findAll();

}
