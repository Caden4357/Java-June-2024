package com.codingdojo.basketball.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.basketball.models.Player;
import com.codingdojo.basketball.repositories.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository pRepo;
	
	 public List<Player> getAll(){
	    	return pRepo.findAll();
	    }
	    
	    public void createPlayer(Player player) {
	    	pRepo.save(player);
	    }
	    
	    public Player getOnePlayer(Long id) {
	    	Optional<Player> optionalPlayer = pRepo.findById(id);
	        if(optionalPlayer.isPresent()) {
	            return optionalPlayer.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public Player update(Player player) {
	    	return pRepo.save(player);
	    }
	    
	    public void deletePlayer(Long id) {
	    	pRepo.deleteById(id);
	    }
}
