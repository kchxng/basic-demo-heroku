package com.jointitdev.demospringwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoSpringWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringWebappApplication.class, args);
	}

	@GetMapping("user")
	public String getUser() {
		return "Spring boot API prepare to start ....";
	}

}
