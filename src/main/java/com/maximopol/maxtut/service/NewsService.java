package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.News;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public void printAllPosition(){
        List<News> list= newsRepository.findAll();

        list.forEach(System.out::println);
    }
    public News findNewsById(Long id){
        return newsRepository.findNewsById(id);
    }
    public List<News> findAllNews(){
        return newsRepository.findAll();
    }
    
    public List<News> findAllNewsByAuthor(Long author){
        return newsRepository.findNewsByAuthor(author);
    }
}
