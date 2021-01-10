package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class SingUpController {
    private final Logger logger = LoggerFactory.getLogger(SingUpController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @RequestMapping(value="/registration",method = RequestMethod.GET)
    public String registration(Model model, SessionStatus sessionStatus) {
        logger.info("Open this page.");
        sessionStatus.setComplete();
        logger.info("Session has completed.");
        model.addAttribute("userForm", new User());
        return "aoth/reg";
    }

    @RequestMapping(value="/registration",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        String result = "";
        if (bindingResult.hasErrors()) {
            logger.info("bindingResult had error");
            return "aoth/reg";
        }

        logger.info(user.toString());
        logger.info(passwordEncoder.encode(user.getPassword()));
        logger.info(user.getConfirmPassword());
        User user1 =userService.findUserByEmailOrUsername(user.getEmail(),user.getUsername());

        if(user1==null){
            if(user.getPassword().equals(user.getConfirmPassword())){
                logger.info("Result function  saveUser="+userService.saveUser(user));
            }
            else {
                model.addAttribute("errorMessage","Пароли не совпадают!");
                logger.info("Пароли не совпадают");
                return "aoth/reg";
            }
        }
        else{
            model.addAttribute("errorMessage","Такого пользователя есть!");
            logger.info("Такой есть");
            return "aoth/reg";
        }
        return "redirect:login";
    }
}
