package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes(value="user")
public class HomeController {
    private final NewsService newsService;

    public HomeController(NewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getIndex(@ModelAttribute("user") User user){

        ModelAndView model= new ModelAndView();

        List<News> list= newsService.findAllNews();
        int count= list.size()%9;
        list.forEach(System.out::println);
        System.out.println(user);

        model.addObject("news",list);

        model.setViewName("index");
        return model;
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
