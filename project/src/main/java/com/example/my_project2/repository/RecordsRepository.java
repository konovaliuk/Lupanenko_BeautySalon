package com.example.my_project2.repository;

import com.example.my_project2.entity.Records;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;

public interface RecordsRepository extends CrudRepository<Records, Integer> {
    List<Records> findByDate(Timestamp date);
}
