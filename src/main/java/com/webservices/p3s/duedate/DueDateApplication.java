package com.webservices.p3s.duedate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class DueDateApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DueDateApplication.class, args);
	}

}

