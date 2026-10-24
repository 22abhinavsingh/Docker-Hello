package com.example.dockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class DockerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHelloApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello Docker World! My Spring Boot Application is running inside a Docker container.";
	}

	@GetMapping("/health")
	public String health(){
		return "Application is healthy!";
	}

}
