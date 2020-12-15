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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value="user")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
         return  new ModelAndView("aoth/login","userForm", new User());
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView getUser(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        ModelAndView modelAndView= new ModelAndView();
        String result = "";
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("aoth/login");
            return modelAndView;
        }
        System.out.println(user);
        User user1 = userService.findUserByEmail(user.getEmail());

        System.out.println(user1);

        if(user1==null){
            System.out.println("такого пользователя нет");
            modelAndView.setViewName("aoth/login");
            return modelAndView;
        }
        if(user.getPassword().equals(user1.getPassword())){
            System.out.println("Пароли совпадают");
            user.setUsername(user1.getUsername());
            user.setId(user1.getId());
        }
        else {
            //неверный пароль
            modelAndView.setViewName("aoth/login");
            return modelAndView;
        }

        modelAndView.addObject("user", user);

        modelAndView.setViewName("redirect:");
        return modelAndView;
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}