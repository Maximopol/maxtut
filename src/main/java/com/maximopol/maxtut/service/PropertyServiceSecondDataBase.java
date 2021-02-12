package com.maximopol.maxtut.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceSecondDataBase {
    @Value("${questions.username}")
    private String username;
    @Value("${questions.password}")
    private String password;
    @Value("${questions.url}")
    private String url;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
