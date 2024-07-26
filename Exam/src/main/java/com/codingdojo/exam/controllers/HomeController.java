package com.codingdojo.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.exam.models.Game;
import com.codingdojo.exam.models.Suggestion;
import com.codingdojo.exam.models.User;
import com.codingdojo.exam.services.GameService;
import com.codingdojo.exam.services.SuggestionService;
import com.codingdojo.exam.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	UserService users;
	@Autowired
	GameService games;
	@Autowired
	SuggestionService suggestions;

	@GetMapping("/homepage")
	public String homepage(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {
			model.addAttribute("user", users.getLoggedInUser(userId));
			model.addAttribute("games", games.getAllByNameAsc());
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
	public String createGame(@Valid @ModelAttribute("game") Game game, BindingResult result, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "gameForm.jsp";
		} else {
			User developer = users.getLoggedInUser(userId);
			System.out.println(developer.getId());
			game.setUser(developer);
			games.createGame(game);
			return "redirect:/homepage";
		}
	}

	@GetMapping("/view/game/{id}")
	public String viewGame(@PathVariable("id") Long id, Model model, HttpSession session, @ModelAttribute("suggestion") Suggestion suggestion) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {
			model.addAttribute("game", games.getOneGame(id));
			return "viewGame.jsp";
		}
	}

	@GetMapping("/edit/game/{id}")
	public String editForm(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		model.addAttribute("game", games.getOneGame(id));
		return "editGame.jsp";
	}

	@PutMapping("/update/game/{id}")
	public String updateGame(@Valid @ModelAttribute("game") Game game, BindingResult result, Model model,HttpSession session, RedirectAttributes redirectAttributes) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		else if (result.hasErrors()) {
			redirectAttributes.addFlashAttribute("error", "No fields can be blank");
			model.addAttribute("game", game);
			return "redirect:/edit/game/" + game.getId();
		}
		else {
			game.setUser(users.getLoggedInUser(userId));
			games.update(game);
			return "redirect:/homepage";
		}
	}

	@DeleteMapping("/delete/game/{gameId}")
	public String deleteGame(@PathVariable("gameId") Long gameId, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		games.deleteGame(gameId);
		return "redirect:/homepage";
	}

	
//	****** SUGGESTIONS ********
	
	@PostMapping("/create/suggestion/{id}")
	public String createSuggestion(@Valid @ModelAttribute("suggestion") Suggestion suggestion, BindingResult result, HttpSession session, @PathVariable("id") Long id, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
			model.addAttribute("game", games.getOneGame(id));
			return "viewGame.jsp";
		}
		else {
			Game oneGame = games.getOneGame(id);
			User loggedInUser = users.getLoggedInUser(userId);
			suggestion.setGame(oneGame);
			suggestion.setUser(loggedInUser);
			suggestions.createSuggestion(suggestion);
			return "redirect:/homepage";
		}
	}
	
	
}
