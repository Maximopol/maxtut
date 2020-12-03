package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KekController {
    @Autowired
    private PositionService positionService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private EmploymenService employmenService;

    @Autowired
    private FileNewsService fileNewsService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private UserService userService;

    @RequestMapping(value="/kek",method = RequestMethod.GET)
    public String viewKek() {

        positionService.printAllPosition();
        System.out.println("\n");
        commentService.printAllComment();
        System.out.println("\n");
        employmenService.printAllEmploymen();
        System.out.println("\n");
        fileNewsService.printAllFileNews();
        System.out.println("\n");
        newsService.printAllPosition();
        System.out.println("\n");
        userService.printAllUser();

        int i=1/0;
        
        return "kek";
    }
}
