package com.codingdojo.restaurants.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.restaurants.models.Restaurant;


@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
	List<Restaurant> findAll(); // were just overriding the return type of get all to make it return a List  
}
