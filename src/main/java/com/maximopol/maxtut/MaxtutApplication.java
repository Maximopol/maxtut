package com.maximopol.maxtut;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource("classpath:database.properties")
public class MaxtutApplication {
	public static void main(String[] args) {
		SpringApplication.run(MaxtutApplication.class, args);
	}
}
