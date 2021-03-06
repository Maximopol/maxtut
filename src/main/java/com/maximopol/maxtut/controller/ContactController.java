package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Questions;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.QuestionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.maximopol.maxtut.service.PropertyServiceSecondDataBase;


@Controller
@SessionAttributes(value="user")
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);
    @Autowired
    QuestionsService questionsService;
//    final PropertyServiceSecondDataBase propertyServiceSecondDataBase;
//
//    public ContactController(PropertyServiceSecondDataBase propertyServiceSecondDataBase) {
//        this.propertyServiceSecondDataBase = propertyServiceSecondDataBase;
//    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView getContactView() {
        logger.info("Open this page.");
        return new ModelAndView("contact");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public ModelAndView sentQuestionToMyEmail(HttpServletRequest req, HttpServletResponse res, Model model, @ModelAttribute("user") User user) {
        String email = req.getParameterValues("email")[0], text = req.getParameterValues("message")[0];

        Questions questions= new Questions();
        questions.setEmail(email);
        questions.setText(text);
        questionsService.saveQuestion(questions);
//       // String SQL = "INSERT INTO public.\"questions \" (email,text) VALUES(?,?)";
//        String SQL = "INSERT INTO `Questions` ( `Email`, `Text`) VALUES(?,?)";
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection dbConnection = DriverManager.getConnection(propertyServiceSecondDataBase.getUrl(), propertyServiceSecondDataBase.getUsername(), propertyServiceSecondDataBase.getPassword());
//            PreparedStatement statement = dbConnection.prepareStatement(SQL);
//            statement.setString(1, email);
//            statement.setString(2, text);
//            statement.addBatch();
//            statement.executeBatch();
//            System.out.println("123123");
//        } catch (SQLException | ClassNotFoundException e) {
//            logger.error(e.toString());
//        }

        return new ModelAndView("contact");
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}
