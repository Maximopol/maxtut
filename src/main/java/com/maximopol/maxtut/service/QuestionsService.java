package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.Questions;
import com.maximopol.maxtut.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {
    @Autowired
    QuestionsRepository questionsRepository;
    public void saveQuestion(Questions questions) {
        questionsRepository.save(questions);
    }
    public void printAllQuestions(){
        List<Questions> list= questionsRepository.findAll();
        list.forEach(System.out::println);
    }
}
