package com.example.my_project2.spring_data;

import com.example.my_project2.entity.Services;
import com.example.my_project2.interfac.ServicesInterface;
import com.example.my_project2.repository.ServicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("ServicesRepository")
@Transactional
@AllArgsConstructor

public class ServicesImpl implements ServicesInterface {
    private ServicesRepository servicesRepository;

    @Override
    public List<Services> findByPrice(Integer id) {
        return servicesRepository.findByPrice(id);
    }

    @Override
    public List<Services> findAll() {
        return (List<Services>) servicesRepository.findAll();
    }
}
