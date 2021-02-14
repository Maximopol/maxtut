package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Questions,Long> {
    @Override
    List<Questions> findAll();
}
