package com.codingdojo.hoppersreceipt.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// class definition and imports here...
    @GetMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
        
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        // etc...
        ArrayList<String> dojos = new ArrayList<String>();
        dojos.add("Burbank");
        dojos.add("Chicago");
        dojos.add("Bellevue");
        model.addAttribute("dojosFromMyController", dojos);
        return "index.jsp";
    }
    
    @GetMapping("/homepage")
    public String homepage() {
    	return "home.jsp";
    }
    @GetMapping("/profile")
    public String profile() {
    	return "profile.jsp";
    }
    //...
    

}
