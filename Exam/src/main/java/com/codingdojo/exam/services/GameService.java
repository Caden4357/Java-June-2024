package com.codingdojo.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.exam.models.Game;
import com.codingdojo.exam.repositories.GameRepository;


@Service
public class GameService {
	@Autowired
	GameRepository gRepo;
	
	 public List<Game> getAll(){
	    	return gRepo.findAll();
	    }
	    
	    public void createGame(Game game) {
	    	gRepo.save(game);
	    }
	    
	    public Game getOneGame(Long id) {
	    	Optional<Game> optionalGame = gRepo.findById(id);
	        if(optionalGame.isPresent()) {
	            return optionalGame.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public Game update(Game game) {
	    	return gRepo.save(game);
	    }
	    
	    public void deleteGame(Long id) {
	    	gRepo.deleteById(id);
	    }
}
