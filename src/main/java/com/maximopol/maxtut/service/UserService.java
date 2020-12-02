package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void printAllUser(){
        List<User> list= userRepository.findAll();

        for (User user:list
        ) {
            System.out.println(user);
        }

    }
}
