package com.maximopol.maxtut;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEncryptableProperties
public class MaxtutApplication {
	public static void main(String[] args) {
		System.out.println(System.getenv("JDBC_DATABASE_PASSWORD"));
		SpringApplication.run(MaxtutApplication.class, args);
	}
}
