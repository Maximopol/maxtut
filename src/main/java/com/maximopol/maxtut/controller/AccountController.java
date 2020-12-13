package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.*;
import com.maximopol.maxtut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private UserService userService;

    @Autowired
    private EmploymentService employmentService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String getAccount(Model model) {
        User user = userService.findUserById(2L);
        Employment employment = employmentService.findEmploymentByUser(user);

        List<Comment> commentList = commentService.getCommentsByPerson(user.getId());

        commentList.forEach(System.out::println);
        System.out.println(user);
        System.out.println(employment);

        model.addAttribute("user", user);
        model.addAttribute("commentList", commentList);

        if (employment == null) {
            return "account/reader";
        } else {
            Position position = positionService.findPositionById(employment.getPosition());

            List<News> newsList = newsService.findAllNewsByAuthor(new Long(employment.getId()));

            newsList.forEach(System.out::println);
            model.addAttribute("newsList", newsList);
            model.addAttribute("position", position);
            model.addAttribute("employment", employment);
            return "account/worker";
        }
    }
}
