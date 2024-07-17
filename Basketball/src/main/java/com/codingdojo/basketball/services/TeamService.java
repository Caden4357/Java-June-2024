package com.codingdojo.basketball.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.basketball.models.Team;
import com.codingdojo.basketball.repositories.TeamRepository;


@Service
public class TeamService {
	
	@Autowired
	TeamRepository tRepo;
	
	 public List<Team> getAll(){
	    	return tRepo.findAll();
	    }
	    
	    public void createTeam(Team team) {
	    	tRepo.save(team);
	    }
	    
	    public Team getOneTeam(Long id) {
	    	Optional<Team> optionalTeam = tRepo.findById(id);
	        if(optionalTeam.isPresent()) {
	            return optionalTeam.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public Team update(Team team) {
	    	return tRepo.save(team);
	    }
	    
	    public void deleteTeam(Long id) {
	    	tRepo.deleteById(id);
	    }
}
