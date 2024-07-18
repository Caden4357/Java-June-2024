package com.codingdojo.basketball.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.basketball.models.Coach;
import com.codingdojo.basketball.repositories.CoachRepository;

@Service
public class CoachService {
	@Autowired
	CoachRepository cRepo;
	
	 public List<Coach> getAll(){
	    	return cRepo.findAll();
	    }
	    
	    public void createCoach(Coach coach) {
	    	cRepo.save(coach);
	    }
	    
	    public Coach getOneCoach(Long id) {
	    	Optional<Coach> optionalCoach = cRepo.findById(id);
	        if(optionalCoach.isPresent()) {
	            return optionalCoach.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public Coach update(Coach coach) {
	    	return cRepo.save(coach);
	    }
	    
	    public void deleteCoach(Long id) {
	    	cRepo.deleteById(id);
	    }
}
