package com.codingdojo.apis.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.codingdojo.apis.models.PokemonList;

@RestController
public class ApiController {
	private String baseUrl = "https://pokeapi.co/api/v2/";
	
	private WebClient client = WebClient.create();
	
	public PokemonList getFirstTenPoke() {
		PokemonList response = client
								.get() // Specifying a get method 
								.uri(baseUrl + "pokemon") //https://pokeapi.co/api/v2/pokemon
								.retrieve() // Executes the request and retrieves the response body.
								.bodyToMono(PokemonList.class)
								.block(); // Blocks the request thread until the Mono completes and returns the PokemonList object.
		return response;
	}
}
