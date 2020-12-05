package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KekController {
    @Autowired
    private PositionService positionService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private EmploymentService employmentService;

    @Autowired
    private FilekService filekService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/kek", method = RequestMethod.GET)
    public String viewKek(Model map) {

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
        //int i=1/0;

        return "kek";
    }
}
