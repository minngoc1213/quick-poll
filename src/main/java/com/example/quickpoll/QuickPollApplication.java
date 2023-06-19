package com.example.quickpoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuickPollApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickPollApplication.class, args);
	}

	@GetMapping("/")
	public String mainPage() {
		return "It works!";
	}

}
