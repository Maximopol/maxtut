package com.maximopol.maxtut.repositorykek;

import com.maximopol.maxtut.entitykek.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Questions,Long> {
    @Override
    List<Questions> findAll();
}
