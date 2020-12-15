package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class SingUpController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/registration",method = RequestMethod.GET)
    public String registration(Model model, SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        model.addAttribute("userForm", new User());
        return "aoth/reg";
    }

    @RequestMapping(value="/registration",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        String result = "";
        if (bindingResult.hasErrors()) {
            return "aoth/reg";
        }

        System.out.println(user);
        System.out.println(user.getConfirmPassword());
        User user1 =userService.findUserByEmailOrUsername(user.getEmail(),user.getUsername());

        if(user1==null){
            if(user.getPassword().equals(user.getConfirmPassword())){
                System.out.println(userService.saveUser(user));
            }
            else {
                System.out.println("Пароли не совпадают");
            }
        }
        else{
            System.out.println("Такой есть");
        }
        return "redirect:login";
    }
}
