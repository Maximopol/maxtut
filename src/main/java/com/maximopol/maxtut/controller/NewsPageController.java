package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.EmploymentService;
import com.maximopol.maxtut.service.FilekService;
import com.maximopol.maxtut.service.NewsService;
import com.maximopol.maxtut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value="user")
public class NewsPageController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private EmploymentService employmentService;
    @Autowired
    private FilekService filekService;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/news/{news}", method = RequestMethod.GET)
    public ModelAndView getComments(  @PathVariable String news){
        ModelAndView model= new ModelAndView();

        System.out.println("Id новости:"+news);
        News news1= newsService.findNewsById(new Long(news));
        news1.setMyFile(filekService.findFilekById(news1.getFilek()));
        model.addObject("news",news1);
        model.setViewName("news/news");

        return model;
    }
    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
