package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Employmen;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.EmploymenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymenService {
    @Autowired
    private EmploymenRepository employmenRepository;

    public void printAllEmploymen(){
        List<Employmen> list= employmenRepository.findAll();

        for (Employmen employmen:list
        ) {
            System.out.println(employmen);
        }
    }
}
