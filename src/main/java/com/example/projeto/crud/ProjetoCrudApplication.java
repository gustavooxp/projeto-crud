package com.example.projeto.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjetoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudApplication.class, args);
	}

}
