package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Integer> {
    Position findPositionById(Integer id);

    @Override
    List<Position> findAll();
}
