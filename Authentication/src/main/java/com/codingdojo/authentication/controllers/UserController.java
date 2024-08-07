package com.codingdojo.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.authentication.models.LoggedInUser;
import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	UserService users;
	
    
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoggedInUser());
        return "index.jsp";
    }
    
    @PostMapping("/register/user")
    public String registerUser(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, HttpSession session, Model model) {
        // TO-DO Later -- call a register method in the service 
        // to do some extra validations and create a new user!
    	users.register(newUser, result);
    	if(result.hasErrors()) {
    		model.addAttribute("newLogin", new LoggedInUser());
    		return "index.jsp";
    	}else {
    		// log the user in i.e store their id in session
    		session.setAttribute("userId", newUser.getId());
    		return "redirect:/homepage";
    	}
    }
    
    @PostMapping("/login/user")
    public String loginUser(@Valid @ModelAttribute("newLogin") LoggedInUser newLogin, BindingResult result, HttpSession session, Model model) {
    	
    	// Call the user service for login 
    	User user = users.login(newLogin, result);
    	if(result.hasErrors()) {
    		model.addAttribute("newUser", new User());
    		return "index.jsp";
    	}else {
    		session.setAttribute("userId", user.getId());
    		return "redirect:/homepage";
    	}
    }
    
    
    // homepage 
    @GetMapping("/homepage")
    public String homepage(HttpSession session, Model model) {
    	Long userId = (Long) session.getAttribute("userId");
    	if(userId == null) {
    		return "redirect:/";
    	}else {
    		model.addAttribute("user", users.getLoggedInUser(userId));
    		return "homepage.jsp";
    	}
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
