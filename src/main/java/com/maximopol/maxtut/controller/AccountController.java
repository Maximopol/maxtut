package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Employment;
import com.maximopol.maxtut.service.EmploymentService;
import com.maximopol.maxtut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
    @Autowired
    private UserService userService;

    @Autowired
    private EmploymentService employmentService;

    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public String getAccount(Model model){
        return "account/reader";
    }
}
