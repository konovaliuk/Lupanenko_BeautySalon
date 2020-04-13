package com.example.my_project2.spring_data;

import com.example.my_project2.entity.Records;
import com.example.my_project2.entity.User;
import com.example.my_project2.interfac.RecordsInterface;
import com.example.my_project2.repository.RecordsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository("RecordsRepository")
@Transactional
@AllArgsConstructor

public class RecordsImpl implements RecordsInterface {
    private RecordsRepository recordsRepository;


    @Override
    public List<Records> findByDate(Timestamp date) {
        return recordsRepository.findByDate(date);
    }

    @Override
    public List<Records> findAll() {
        return (List<Records>) recordsRepository.findAll();
    }
}
