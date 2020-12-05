package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Filek;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilekRepository extends JpaRepository<Filek, Long> {
    Filek findFilekById(Long id);
    Filek findFilekByTitle(String title);

    @Override
    List<Filek> findAll();
}
