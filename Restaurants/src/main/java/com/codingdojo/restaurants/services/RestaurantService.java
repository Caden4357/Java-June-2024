package com.codingdojo.restaurants.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.restaurants.models.Restaurant;
import com.codingdojo.restaurants.repositories.RestaurantRepository;

@Service
public class RestaurantService {
	
    // adding the book repository as a dependency
    private final RestaurantRepository rRepo;
    
    public RestaurantService(RestaurantRepository rRepo) {
		this.rRepo = rRepo;
	}
    
//    @Autowired
//    RestaurantRepository rRepo;
    
    public List<Restaurant> getAll(){
    	return rRepo.findAll();
    }
    
    public void createRestaurant(Restaurant restaurant) {
    	rRepo.save(restaurant);
    }
}
