package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Comment;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.repository.CommentRepository;
import com.maximopol.maxtut.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final UserService userService;

    public CommentService(CommentRepository commentRepository, UserService userService) {
        this.commentRepository = commentRepository;
        this.userService = userService;
    }

    public void printAllComment() {
        List<Comment> list = commentRepository.findAll();

        list.forEach(System.out::println);
    }

    public List<Comment> getFullComments() {
        List<Comment> commentList = commentRepository.findAll();
        for (Comment comment : commentList
        ) {
            comment.setMe(userService.findUserById(comment.getPerson()));
        }
        return commentList;
    }

    public List<Comment> getCommentsByNews(Long news) {
        return commentRepository.findCommentsByNews(news);
    }

    public List<Comment> getFullCommentsByNews(Long news) {
        List<Comment> commentList = commentRepository.findCommentsByNews(news);
        for (Comment comment : commentList
        ) {
            comment.setMe(userService.findUserById(comment.getPerson()));
        }
        return commentList;
    }

    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    public List<Comment> getCommentsByPerson(Long person) {
        return commentRepository.findCommentsByPerson(person);

    }

    public Comment findCommentById(Long id) {
        return commentRepository.findCommentById(id);
    }

    public boolean saveComment(Comment comment) {
        commentRepository.save(comment);

        return true;
    }
}
