package com.codingdojo.basketball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.basketball.models.Player;
import com.codingdojo.basketball.models.Team;
import com.codingdojo.basketball.services.PlayerService;
import com.codingdojo.basketball.services.TeamService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	TeamService teams;
	@Autowired
	PlayerService players;
	
	@GetMapping("/")
	public String index(@ModelAttribute("team") Team team, Model model) {
		model.addAttribute("teams", teams.getAll());
		return "index.jsp";
	}
	
	@PostMapping("/create/team")
	public String createTeam(@Valid @ModelAttribute("team") Team team, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
			teams.createTeam(team);
			return "redirect:/";
		}
	}
	
	@GetMapping("/new/player")
	public String playerForm(@ModelAttribute("player") Player player, Model model) {
		model.addAttribute("teams", teams.getAll());
		return "playerForm.jsp";
	}
	
	@PostMapping("/create/player")
	public String createPlayer(@Valid @ModelAttribute("player") Player player,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("teams", teams.getAll());
			return "playerForm.jsp";
		}else {
			players.createPlayer(player);
			return "redirect:/";
		}
	}
	@GetMapping("/team/{teamId}")
	public String viewTeam(@PathVariable("teamId") Long id, Model model) {
		model.addAttribute("team", teams.getOneTeam(id));
		return "viewTeam.jsp";
	}
}
