package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {
    @Override
    List<News> findAll();
    News findNewsById(Long id);
}
