package com.daniel.challengforo.challengaluraforo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.daniel.challengforo")

public class ChallengaluraforoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengaluraforoApplication.class, args);
	}

}
