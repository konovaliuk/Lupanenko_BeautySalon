package com.example.my_project2.repository;

import com.example.my_project2.entity.Services;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServicesRepository extends CrudRepository<Services, Integer> {
    List<Services> findByPrice(Integer price);
}
