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

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("userForm", new User());
        return "aoth/login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String getUser(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        String result = "";
        if (bindingResult.hasErrors()) {
            return "aoth/login";
        }
        User user1 = userService.findUserByEmail(user.getEmail());

        System.out.println(user1);

        if(user1==null){
            //такого пользователя нет
            return "aoth/login";
        }
        if(user.getPassword().equals(user1.getPassword())){
            System.out.println("Пароли совпадают");
            user.setUsername(user1.getUsername());
        }
        else {
            //неверный пароль
            return "aoth/login";
        }



        System.out.println(user);

        return "redirect:error";
    }
}