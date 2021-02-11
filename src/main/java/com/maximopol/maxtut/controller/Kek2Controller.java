package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Kek2Controller {
    private final UserService userService;

    public Kek2Controller(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/kek2",method = RequestMethod.GET)
    public String viewKek2() {
        return "kek2";
    }
    @RequestMapping(value="/kek2",method = RequestMethod.POST)
    public String kekKek2(Model model) {

        User user =userService.findUserById(2L);
        model.addAttribute("kekek",user);

        return "kek2";
    }
}
