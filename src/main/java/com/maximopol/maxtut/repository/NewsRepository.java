package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {
    News findNewsById(Long id);

    List<News> findNewsByAuthor(Long author);

    @Override
    List<News> findAll();
}
