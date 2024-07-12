package com.codingdojo.burgertracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.burgertracker.models.Burger;
import com.codingdojo.burgertracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgers;
	
//	Homepage with all burgers
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("burger") Burger burger) {
		model.addAttribute("burgers", burgers.getAll());
		return "index.jsp";
	}
	
//	Create Burger also on homepage
	@PostMapping("/create/burger")
	public String newBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burgers", burgers.getAll());
			return "index.jsp";
		}else {
			burgers.createBurger(burger);
			return "redirect:/";
		}
	}
	
//	Render edit burger form
	@GetMapping("/edit/burger/{id}")
	public String editForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("burger", burgers.getOneBurger(id));
		return "editBurger.jsp";
	}
	
	@PutMapping("/update/burger/{id}")
	public String updateBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "editBurger.jsp";
		}else {
			burgers.updateBurger(burger);
			return "redirect:/";
		}
	}
	
}
