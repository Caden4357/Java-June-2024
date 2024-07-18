package com.codingdojo.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.authentication.models.LoggedInUser;
import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	// see if the user already has an account 
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "Matches", "An Account already exists please login"); // add an error to the result obj
    	}
    	// if we get this far we know the user has an email that doesnt exist in our DB
    	// need to check if the passwords match 
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "matches", "Passwords dont match"); // add an error to the result obj
    	}
    	System.out.println("HERE");
    	// check for any additional errors 
    	if(result.hasErrors()) { // checking if any errors got added to the result obj
    		return null;    		
    	}
    	// if we get this far everything checks out and the password must be hashed and salted and save the user in the DB
    	String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashedPassword);
    	return userRepo.save(newUser);
    }
    
    
    public User login(LoggedInUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        return null;
    }
    
    public User getLoggedInUser(Long id) {
    	Optional<User> potentialUser = userRepo.findById(id);
    	if(potentialUser.isPresent()) {
    		return potentialUser.get();
    	}
    	return null;
    }

}
