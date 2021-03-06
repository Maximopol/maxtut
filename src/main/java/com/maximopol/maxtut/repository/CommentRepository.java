package com.maximopol.maxtut.repository;

import com.maximopol.maxtut.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findCommentById(Long id);
    List<Comment> findCommentsByPerson(Long id);
    List<Comment> findCommentsByNews(Long id);

    @Override
    List<Comment> findAll();
}
