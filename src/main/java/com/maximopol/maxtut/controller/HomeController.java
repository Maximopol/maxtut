package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
//    @Autowired
//    private NewsService newsService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(Model model){

       // model.addAttribute("news",newsService.findAllNews());
        return "index";
    }

}
