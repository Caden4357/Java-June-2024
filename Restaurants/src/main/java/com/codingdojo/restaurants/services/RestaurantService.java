package com.codingdojo.restaurants.services;

import java.util.List;
import java.util.Optional;

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
    
    public Restaurant getOneRestaurant(Long id) {
    	Optional<Restaurant> optionalRest = rRepo.findById(id);
        if(optionalRest.isPresent()) {
            return optionalRest.get();
        } else {
            return null;
        }
    }
    
    public Restaurant update(Restaurant restaurant) {
    	return rRepo.save(restaurant);
    }
    
    public void deleteRestaurant(Long id) {
    	rRepo.deleteById(id);
    }
}
