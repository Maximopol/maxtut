package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes(value="user")
public class ContactController {
    @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public ModelAndView getContactView(){

        return new ModelAndView("contact");
    }
    @RequestMapping(value = "/contact",method = RequestMethod.POST)
    public ModelAndView sentQuestionToMyEmail(HttpServletRequest req, HttpServletResponse res, Model model){
        System.out.println("Люди что-о нажали");
        String[] list = req.getParameterValues("name");
        StringBuffer string=new StringBuffer("UserName:");

        for(String text: list){
            string.append(text);
        }

        string.append("\nUserEmail:");
        for(String text: req.getParameterValues("email")){
            string.append(text);
        }

        string.append("\nUserText:\n");
        for(String text: req.getParameterValues("message")){
            string.append(text);
        }
        System.out.println(string);

        return new ModelAndView("contact");
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
