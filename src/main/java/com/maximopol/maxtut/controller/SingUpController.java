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
public class SingUpController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/registration",method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "aoth/reg";


//        model.addAttribute("userForm", new Client());
//
//        logger.info("Someone opened the registration page");
//        return "public/reg2";
    }

    @RequestMapping(value="/registration",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        String result = "";
        if (bindingResult.hasErrors()) {
            return "aoth/reg";
        }

        System.out.println(user);
//        if (!EmailValidator.IsValidEmail(client.getEmail())) {
//            result = "У тебя почта странная\n";
//        }
//
//        if (!client.getPassword().equals(client.getPasswordConfirm())) {
//            result += "Пароли не совпадают";
//        }
//
//        if (!result.equals("")) {
//            logger.warn(result);
//            model.addAttribute("passwordError", result);
//            return "public/reg2";
//        }
//
//        if (!userService.saveUser(client)) {
//            logger.warn("Пользователь с такой почтой уже существует!");
//            model.addAttribute("passwordError", "Пользователь с такой почтой уже существует!");
//            return "public/reg2";
//        }
//        logger.info("New user with mail " + client.getEmail() + " added successfully");
        return "redirect:login";
    }
}
