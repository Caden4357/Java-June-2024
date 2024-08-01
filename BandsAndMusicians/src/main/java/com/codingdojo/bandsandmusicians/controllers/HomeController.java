package com.codingdojo.bandsandmusicians.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.bandsandmusicians.models.Band;
import com.codingdojo.bandsandmusicians.models.Musician;
import com.codingdojo.bandsandmusicians.services.BandService;
import com.codingdojo.bandsandmusicians.services.MusicianService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	BandService bands;
	@Autowired
	MusicianService musicians;
	
	@GetMapping("/")
	public String index(@ModelAttribute("band") Band band, Model model) {
		model.addAttribute("bands", bands.allBands());
		return "index.jsp";
	}
	@PostMapping("/create/band")
	public String createBand(@ModelAttribute("band") Band band) {
		bands.createBand(band);
		return "redirect:/";
	}
	@GetMapping("/band/{id}")
	public String viewBand(@PathVariable("id") Long id, Model model) {
		model.addAttribute("band", bands.oneBand(id));
		model.addAttribute("musicians", musicians.allMusician());
		return "band.jsp";
	}
	@PostMapping("/add/musician/to/{bandId}")
	public String addMusicianToBand(@PathVariable("bandId") Long bandId, @RequestParam("musicianId") String musicianId) {
		Band band = bands.oneBand(bandId);
		Long mId = Long.parseLong(musicianId);
		Musician musician = musicians.oneMusician(mId);
		musicians.addMusicianToBand(band, musician);
		return "redirect:/band/" + bandId;
	}
}

