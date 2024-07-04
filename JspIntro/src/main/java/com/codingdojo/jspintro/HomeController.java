package com.codingdojo.jspintro;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("day", "Tuesday");
		model.addAttribute("month", "July");
		model.addAttribute("year", 2024);
		
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Jacob");
		students.add("Albert");
		students.add("Jeanine");
		students.add("Sapphire");
		model.addAttribute("students", students);
		return "index.jsp";
	}
}
