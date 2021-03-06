package com.demo.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootExampleApplication {

	@GetMapping("/")
	public String welcome() {
		return "Wecome to first deployment";
	}
	
	@GetMapping("/{input}")
	public String sample(@PathVariable String input) {
		return "Hello "+input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}
