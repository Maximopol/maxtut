package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.FileNews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileNewsRepository extends JpaRepository<FileNews, Long> {
    FileNews findPositionById(Long id);

    @Override
    List<FileNews> findAll();
}
