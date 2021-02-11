package com.maximopol.maxtut;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class MaxtutApplication {
	public static void main(String[] args) {
		SpringApplication.run(MaxtutApplication.class, args);
	}
}
