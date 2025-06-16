package com.liftoff.liftoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class LiftoffApplication {

	public string test() {
		return "we up and running bitch!";
	}

	public static void main(String[] args) {
		SpringApplication.run(LiftoffApplication.class, args);
	}

}
