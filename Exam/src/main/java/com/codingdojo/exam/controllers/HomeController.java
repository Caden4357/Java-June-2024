package com.codingdojo.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.exam.models.Game;
import com.codingdojo.exam.models.User;
import com.codingdojo.exam.services.GameService;
import com.codingdojo.exam.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	UserService users;
	@Autowired
	GameService games;

	
	@GetMapping("/homepage")
	public String homepage(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {
			model.addAttribute("user", users.getLoggedInUser(userId));
			model.addAttribute("games", games.getAll());
			return "homepage.jsp";
		}
	}

	@GetMapping("/new/game")
	public String gameForm(@ModelAttribute("game") Game game, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {

			return "gameForm.jsp";
		}
	}

	@PostMapping("/create/game")
	public String createGame(@Valid @ModelAttribute("game") Game game, BindingResult result, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "gameForm.jsp";
		}else {
			User developer = users.getLoggedInUser(userId);
			game.setUser(developer);
			games.createGame(game);
			return "redirect:/homepage";
		}
	}
}
