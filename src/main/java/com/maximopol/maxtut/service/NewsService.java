package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public void printAllPosition(){
        List<News> list= newsRepository.findAll();

        for (News news:list
        ) {
            System.out.println(news);
        }

    }
    public News findNewsById(Long id){
        return newsRepository.findNewsById(id);
    }
}
