package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BooksApplication { // Путь к базе данных H2: http://localhost:8080/h2-console

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

}
