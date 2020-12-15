package com.maximopol.maxtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ContactController {
    @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public String getContactView(){

        return "contact";
    }
    @RequestMapping(value = "/contact",method = RequestMethod.POST)
    public String sentQuestionToMyEmail(HttpServletRequest req, HttpServletResponse res, Model model){
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

        return "contact";
    }
}
