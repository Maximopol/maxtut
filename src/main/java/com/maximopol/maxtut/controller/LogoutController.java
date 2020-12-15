package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value="user")
public class LogoutController {
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ModelAndView login(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return  new ModelAndView("aoth/login","userForm", new User());
    }
}
