package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Comment;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.CommentRepository;
import com.maximopol.maxtut.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public void printAllComment(){
        List<Comment> list= commentRepository.findAll();

        for (Comment comment:list
        ) {
            System.out.println(comment);
        }

    }

    public Comment findCommentById(Long id){
        return commentRepository.findCommentById(id);
    }
}
