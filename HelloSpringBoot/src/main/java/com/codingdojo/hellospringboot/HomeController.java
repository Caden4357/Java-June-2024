package com.codingdojo.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/funny/joke")
	public String funnyJoke() {
		return "What do you call a alligator in a vest? ";
	}
	
	@GetMapping("/lucky/{number}/{word}")
	public String luckyNum(@PathVariable("number") Integer number, @PathVariable("word") String word) {
		return "the lucky number is: " + number + " and the word of the day is: " + word; 
	}
	
}
