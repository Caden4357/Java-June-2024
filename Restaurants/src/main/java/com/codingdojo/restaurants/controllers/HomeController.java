package com.codingdojo.restaurants.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.restaurants.models.Restaurant;
import com.codingdojo.restaurants.services.RestaurantService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	
    // adding the book repository as a dependency
    private final RestaurantService restaurants;
    
    public HomeController(RestaurantService restaurants) {
		this.restaurants = restaurants;
	}

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("rest") Restaurant rest) {
    	List<Restaurant> allRestaurants = restaurants.getAll();
    	model.addAttribute("restaurants", allRestaurants);
    	return "dashboard.jsp";
    }
    @PostMapping("/create/restaurant")
    public String newRestaurant(@Valid @ModelAttribute("rest") Restaurant rest, BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		List<Restaurant> allRestaurants = restaurants.getAll();
        	model.addAttribute("restaurants", allRestaurants);
    		return "index.jsp";
    	}
    	restaurants.createRestaurant(rest);
    	return "redirect:/";
    }
    
    @GetMapping("/restaurant/{id}")
    public String oneRestaurant(Model model, @PathVariable("id") Long id) {
    	Restaurant restaurant = restaurants.getOneRestaurant(id);
    	model.addAttribute("restaurant", restaurant);
    	return "oneRestaurant.jsp";
    }
    
    @GetMapping("/edit/restaurant/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
    	model.addAttribute("restaurant", restaurants.getOneRestaurant(id));
    	return "edit.jsp";
    }
    
    @PutMapping("/update/restaurant/{id}")
    public String updateRestaurant(@Valid @ModelAttribute("restaurant") Restaurant restaurant, BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		model.addAttribute("restaurant", restaurant);
    		return "edit.jsp";
    	}else {
    		restaurants.update(restaurant);
    		return "redirect:/";
    	}
    	
    }
    
    @DeleteMapping("/delete/restaurant/{id}")
    public String deleteRestaurant(@PathVariable("id") Long id) {
    	restaurants.deleteRestaurant(id);
    	return "redirect:/";
    }
    
}
