package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploymenRepository extends JpaRepository<Employment,Integer> {
    @Override
    List<Employment> findAll();
    Employment findEmploymenById(Integer id);
}
