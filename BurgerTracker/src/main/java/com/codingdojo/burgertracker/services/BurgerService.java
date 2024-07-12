package com.codingdojo.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.burgertracker.models.Burger;
import com.codingdojo.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	@Autowired
	BurgerRepository bRepo;
	
	
    public List<Burger> getAll(){
    	return bRepo.findAll();
    }
	
    public Burger createBurger(Burger burger) {
    	return bRepo.save(burger);
    }
    
    public Burger getOneBurger(Long id) {
    	Optional<Burger> optionalBurger = bRepo.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
    
    public Burger updateBurger(Burger burger) {
    	return bRepo.save(burger);
    }

}
