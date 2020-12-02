package com.maximopol.maxtut.service;

import com.maximopol.maxtut.entity.FileNews;
import com.maximopol.maxtut.entity.Position;
import com.maximopol.maxtut.repository.FileNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileNewsService {
    @Autowired
    private FileNewsRepository fileNewsRepository;

    public void printAllFileNews(){
        List<FileNews> list= fileNewsRepository.findAll();

        for (FileNews fileNews:list
        ) {
            System.out.println(fileNews);
        }

    }
}
