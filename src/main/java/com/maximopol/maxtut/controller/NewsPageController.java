package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.service.EmploymentService;
import com.maximopol.maxtut.service.FilekService;
import com.maximopol.maxtut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsPageController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private EmploymentService employmentService;
    @Autowired
    private FilekService filekService;

    @RequestMapping(value = "/news/{news}", method = RequestMethod.GET)
    public String getComments(Model model, @PathVariable String news){
        System.out.println("Id новости:"+news);
        News news1= newsService.findNewsById(new Long(news));
         //news1.setEmployment(employmentService.findEmploymentById(news1.getAuthor()));
        news1.setMyFile(filekService.findFilekById(news1.getFilek()));
            model.addAttribute("news",news1);

        return "news/news";
    }
}
