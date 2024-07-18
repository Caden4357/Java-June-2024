package com.codingdojo.basketball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.basketball.models.Coach;
import com.codingdojo.basketball.models.Player;
import com.codingdojo.basketball.models.Team;
import com.codingdojo.basketball.services.CoachService;
import com.codingdojo.basketball.services.PlayerService;
import com.codingdojo.basketball.services.TeamService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	TeamService teams;
	@Autowired
	PlayerService players;
	@Autowired
	CoachService coaches;
	
	// Team form
	@GetMapping("/")
	public String index(@ModelAttribute("teamForm") Team emptyTeam, Model model) {
		model.addAttribute("teams", teams.getAll());
		return "index.jsp";
	}
	// Team Post
	@PostMapping("/create/team")
	public String createTeam(@Valid @ModelAttribute("teamForm") Team completedTeam, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("teams", teams.getAll());
			return "index.jsp";
		}
		else {
			teams.createTeam(completedTeam);
			return "redirect:/";
		}
	}
	// Player form
	@GetMapping("/new/player")
	public String playerForm(@ModelAttribute("player") Player player, Model model) {
		model.addAttribute("teams", teams.getAll());
		return "playerForm.jsp";
	}
	// Player Post
	@PostMapping("/create/player")
	public String createPlayer(@Valid @ModelAttribute("player") Player player,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("teams", teams.getAll());
			return "playerForm.jsp";
		}else {
			Long teamId = player.getTeam().getId();
			players.createPlayer(player);
			return "redirect:/team/" + teamId;
		}
	}
	// View one team
	@GetMapping("/team/{teamId}")
	public String viewTeam(@PathVariable("teamId") Long id, Model model) {
		model.addAttribute("team", teams.getOneTeam(id));
		return "viewTeam.jsp";
	}
	// coach form 
	@GetMapping("/new/coach")
	public String coachForm(@ModelAttribute("coachForm") Coach emptyCoachConstructor, Model model) {
		model.addAttribute("teams", teams.getAll());
		return "coachForm.jsp";
	}
	
	@PostMapping("/create/coach")
	public String createCoach(@Valid @ModelAttribute("coachForm") Coach completedCoachObj, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("teams", teams.getAll());
			return "coachForm.jsp";
		}else {
			Long teamId = completedCoachObj.getTeam().getId();
			coaches.createCoach(completedCoachObj);
			return "redirect:/team/" + teamId;
		}
	}
}
