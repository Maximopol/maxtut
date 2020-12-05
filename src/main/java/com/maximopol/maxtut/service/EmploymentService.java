package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Employment;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.repository.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentService {
    @Autowired
    private EmploymentRepository employmentRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private PositionService positionService;

    public void printAllEmployments() {
        List<Employment> list = employmentRepository.findAll();
//        employmentRepository.findEmploymentsByPosition(0L);

        for (Employment employment : list
        ) {
            System.out.println(employment);
        }
    }

    public List<Employment> getAllAllEmployments() {
        return employmentRepository.findAll();
    }

    public List<Employment> getAllAllEmploymentsWithFullInfo() {
        List<Employment> list = employmentRepository.findAll();


        for (Employment employment : list
        ) {
            employment.setUser(userService.findUserById(employment.getPerson()));
            employment.setMyPosition(positionService.findPositionById(employment.getPosition()));
        }
        return list;
    }

    public Employment findEmploymentById(Integer id) {
        return employmentRepository.findEmploymentById(id);
    }

    public Employment findEmploymentByUser(User user) {
        return findEmploymentByUser(user.getId());
    }

    public Employment findEmploymentByUser(Long id) {
        return employmentRepository.findEmploymentByPerson(id);
    }
}
