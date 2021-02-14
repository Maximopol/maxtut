package com.maximopol.maxtut.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceSecondDataBase {
    @Value("${questions.datasource.username}")
    private String username;
    @Value("${questions.datasource.password}")
    private String password;
    @Value("${questions.datasource.url}")
    private String url;
    @Value("${questions.datasource.driverClassName}")
    private String driverClassName;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }
}
