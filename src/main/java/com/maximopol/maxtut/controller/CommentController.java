package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Comment;
import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.service.CommentService;
import com.maximopol.maxtut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
@Autowired
private NewsService newsService;


    @RequestMapping(value = "/node/{comments}", method = RequestMethod.GET)
    public String getComments(Model model, @PathVariable String comments) {
        System.out.println("Id новости:" + comments);

        List<Comment> commentList = commentService.getFullCommentsByNews(new Long(comments));

        commentList.forEach(System.out::println);

        News news= newsService.findNewsById(new Long(comments));

        System.out.println(commentList.size());
        model.addAttribute("comments",commentList);
        model.addAttribute("nameNews",news);

        return "news/comments";
    }

    @RequestMapping(value = "/node/{comments}", method = RequestMethod.POST, params = "addComment")
    public String addNewComment(HttpServletRequest req, HttpServletResponse res, Model model, @PathVariable String comments){

        System.out.println(Arrays.toString(req.getParameterValues("w3review")));

        return getComments(model,comments);
    }
    @RequestMapping(value = "/node/{comments}", method = RequestMethod.POST, params = "cancel")
    public String cancelAddNewComment(Model model, @PathVariable String comments){
        return getComments(model,comments);
    }
}
