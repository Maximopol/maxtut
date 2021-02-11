package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Filek;
import com.maximopol.maxtut.repository.FilekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilekService {
    @Autowired
    private FilekRepository filekRepository;

    public void printAllFilek() {
        List<Filek> list = filekRepository.findAll();

        list.forEach(System.out::println);
    }

    public Filek findFilekById(Long id) {
        return filekRepository.findFilekById(id);
    }
}
