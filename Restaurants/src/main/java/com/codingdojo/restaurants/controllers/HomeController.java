package com.codingdojo.restaurants.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.restaurants.models.Restaurant;
import com.codingdojo.restaurants.services.RestaurantService;

@Controller
public class HomeController {
	
    // adding the book repository as a dependency
    private final RestaurantService restaurants;
    
    public HomeController(RestaurantService restaurants) {
		this.restaurants = restaurants;
	}

    @GetMapping("/")
    public String index(Model model) {
    	List<Restaurant> allRestaurants = restaurants.getAll();
    	model.addAttribute("restaurants", allRestaurants);
    	return "index.jsp";
    }
    
}
