package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Employment;
import com.maximopol.maxtut.repository.EmploymenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymenService {
    @Autowired
    private EmploymenRepository employmenRepository;

    public void printAllEmploymen(){
        List<Employment> list= employmenRepository.findAll();

        for (Employment employment :list
        ) {
            System.out.println(employment);
        }
    }
    public Employment findEmploymenById(Integer id){
        return employmenRepository.findEmploymenById(id);
    }
}
