package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.*;
import com.maximopol.maxtut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes(value="user")
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
    @PreAuthorize("hasRole('USER')")
    public String getAccount(Model model,@ModelAttribute("user") User user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        System.out.println(auth);

        user=(User)auth.getPrincipal();


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

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
