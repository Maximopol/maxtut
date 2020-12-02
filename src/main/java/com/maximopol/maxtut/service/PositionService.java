package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.PositionRepository;
import com.maximopol.maxtut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    public void printAllPosition(){
        List<Position> list= positionRepository.findAll();

        for (Position position:list
             ) {
            System.out.println(position);
        }
        
    }
}
