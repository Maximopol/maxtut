package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Comment;
import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.CommentService;
import com.maximopol.maxtut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@SessionAttributes(value="user")
public class CommentController {
    private final CommentService commentService;
    private final NewsService newsService;

    public CommentController(CommentService commentService, NewsService newsService) {
        this.commentService = commentService;
        this.newsService = newsService;
    }


    @RequestMapping(value = "/node/{comments}", method = RequestMethod.GET)
    public String getComments(Model model, @PathVariable String comments) {
        System.out.println("Id новости:" + comments);

        List<Comment> commentList = commentService.getFullCommentsByNews(new Long(comments));

        commentList.forEach(System.out::println);

        News news = newsService.findNewsById(new Long(comments));

        System.out.println(commentList.size());
        model.addAttribute("comments", commentList);
        model.addAttribute("nameNews", news);

        return "news/comments";
    }

    @RequestMapping(value = "/node/{comments}", method = RequestMethod.POST, params = "addComment")
    public String addNewComment(HttpServletRequest req, HttpServletResponse res, Model model, @PathVariable String comments,@ModelAttribute("user") User user) {
        String[] list = req.getParameterValues("w3review");
        StringBuffer string=new StringBuffer();

        for(String text: list){
            string.append(text);
        }
        System.out.println(string);
        System.out.println(list.length);

        GregorianCalendar cannes = new GregorianCalendar();
        cannes.set(Calendar.ERA, GregorianCalendar.BC);

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(formater.format(cannes.getTime()));


        Comment comment= new Comment();
        comment.setDate(formater.format(cannes.getTime()));
        comment.setNews(new Long(comments));
        comment.setText(string.toString());
        comment.setPerson(user.getId());

        System.out.println(comment);
        commentService.saveComment(comment);

        return getComments(model, comments);
    }

    @RequestMapping(value = "/node/{comments}", method = RequestMethod.POST, params = "cancel")
    public String cancelAddNewComment(Model model, @PathVariable String comments) {
        return getComments(model, comments);
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
