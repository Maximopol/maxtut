package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploymentRepository extends JpaRepository<Employment,Integer> {
    @Override
    List<Employment> findAll();
    Employment findEmploymentById(Integer id);
    Employment findEmploymentByPerson(Long id);
    List<Employment> findEmploymentsByPosition(Long position);
}
