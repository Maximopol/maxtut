package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView getContactView() {
        logger.info("Open this page.");
        return new ModelAndView("contact");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public ModelAndView sentQuestionToMyEmail(HttpServletRequest req, HttpServletResponse res, Model model, @ModelAttribute("user") User user) {
        String name = req.getParameterValues("name")[0],
                email = req.getParameterValues("email")[0],
                text = req.getParameterValues("message")[0];

        logger.info(user.toString());
        logger.info(name);
        logger.info(email);
        logger.info(text);


        return new ModelAndView("contact");
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
