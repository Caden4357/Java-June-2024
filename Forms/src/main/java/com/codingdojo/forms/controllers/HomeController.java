package com.codingdojo.forms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);			
		}
		return "index.jsp";
	}
	
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage.jsp";
	}
	
	
	@PostMapping("/favorite/character")
	public String favCharacter(HttpSession session, @RequestParam("name") String name, @RequestParam("universe") String universe, @RequestParam("age") Integer age,@RequestParam("superPower") String superPower) {
		String characterInfo = name + " Lives in " + universe + " And is " + age + " years old " + " He's known for his ability to " + superPower;
		session.setAttribute("favoriteCharacterInfo", characterInfo);
		return "redirect:/homepage";
	}
	
	@PostMapping("/increment")
	public String increment(HttpSession session) {
		int count = (Integer) session.getAttribute("count");// 0
		count++; //1 
		System.out.println(session.getAttribute("count"));
		session.setAttribute("count", count); //1 
		return "redirect:/";
	}
	
	@PostMapping("/reset/count")
	public String resetCount(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
