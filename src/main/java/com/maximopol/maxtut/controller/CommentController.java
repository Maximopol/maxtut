package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Comment;
import com.maximopol.maxtut.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/node/{comments}", method = RequestMethod.GET)
    public String getComments(Model model, @PathVariable String comments) {
        System.out.println("Id новости:" + comments);

        List<Comment> commentList = commentService.getFullCommentsByNews(new Long(comments));

        System.out.println(commentList.size());
        model.addAttribute("comments",commentList);


        return "news/comments";
    }
}
