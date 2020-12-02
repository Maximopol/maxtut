package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Employmen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploymenRepository extends JpaRepository<Employmen,Integer> {
    @Override
    List<Employmen> findAll();
    Employmen findEmploymenById(Integer id);
}
