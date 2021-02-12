package com.maximopol.maxtut.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceSecondDataBase {
    private final Logger logger = LoggerFactory.getLogger(PropertyServiceSecondDataBase.class);

    public PropertyServiceSecondDataBase() {
        logger.info("I am cat");
        logger.info(username);
        logger.info(password);
    }

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
