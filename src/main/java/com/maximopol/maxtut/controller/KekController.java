package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class KekController {
    private final PositionService positionService;

    private final CommentService commentService;

    private final EmploymentService employmentService;

    private final FilekService filekService;

    private final NewsService newsService;

    private final UserService userService;

    public KekController(PositionService positionService, CommentService commentService, EmploymentService employmentService, FilekService filekService, NewsService newsService, UserService userService) {
        this.positionService = positionService;
        this.commentService = commentService;
        this.employmentService = employmentService;
        this.filekService = filekService;
        this.newsService = newsService;
        this.userService = userService;
    }

    @RequestMapping(value = "/kek", method = RequestMethod.GET)
    public String viewKek(Model map,@RequestParam(value = "inquiry", required = false) String checkboxValue) {

        positionService.printAllPosition();
        System.out.println("\n");
        commentService.printAllComment();
        System.out.println("\n");
        employmentService.printAllEmployments();
        System.out.println("\n");
        filekService.printAllFilek();
        System.out.println("\n");
        newsService.printAllPosition();
        System.out.println("\n");
        userService.printAllUser();

        User user = userService.findUserById(1L);

        map.addAttribute("kekek", user);
        System.out.println("\n");
        System.out.println(checkboxValue);
       // int i=1/0;

        return "kek";
    }
    @RequestMapping(value = "/kek", method = RequestMethod.POST)
    public String viewKekR(Model map,@RequestParam(value = "inquiry", required = false) String checkboxValue) {



        User user = userService.findUserById(1L);

        map.addAttribute("kekek", user);
        System.out.println("\n");
        System.out.println(checkboxValue);
        //int i=1/0;

        return "kek";
    }
}
