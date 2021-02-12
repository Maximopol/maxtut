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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.maximopol.maxtut.service.PropertyServiceSecondDataBase;


@Controller
@SessionAttributes(value="user")
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);

//    @Autowired
//    PropertyServiceSecondDataBase propertyServiceSecondDataBase;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView getContactView() {
        logger.info("Open this page.");
        return new ModelAndView("contact");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public ModelAndView sentQuestionToMyEmail(HttpServletRequest req, HttpServletResponse res, Model model, @ModelAttribute("user") User user) {
        String email = req.getParameterValues("email")[0], text = req.getParameterValues("message")[0];

//        String SQL = "INSERT INTO public.\"questions \" (email,text) VALUES(?,?)";
//        try (Connection dbConnection = DriverManager.getConnection("propertyServiceSecondDataBase.getUrl()", "propertyServiceSecondDataBase.getUsername()", "propertyServiceSecondDataBase.getPassword()"); PreparedStatement statement = dbConnection.prepareStatement(SQL);) {
//            statement.setString(1, email);
//            statement.setString(2, text);
//            statement.addBatch();
//            statement.executeBatch();
//        } catch (SQLException e) {
//            logger.error(e.getSQLState());
//        }

        return new ModelAndView("contact");
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
