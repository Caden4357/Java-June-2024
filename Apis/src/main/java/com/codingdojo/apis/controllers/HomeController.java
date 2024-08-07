package com.codingdojo.apis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.apis.models.Pokemon;
import com.codingdojo.apis.models.PokemonList;

@Controller
public class HomeController {
	@Autowired
	private ApiController api;
	
	@GetMapping("/")
	public String getPokeList(Model model) {
		PokemonList pokelist = api.getFirstTenPoke();
		/*
		 * for(Pokemon pokemon : pokelist.getPokeList()) {
		 * System.out.println(pokemon.getName()); }
		 */
		model.addAttribute("pokelist", pokelist.getPokeList());
		return "index.jsp";
	}
}
