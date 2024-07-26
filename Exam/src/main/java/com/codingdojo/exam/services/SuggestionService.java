package com.codingdojo.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.exam.models.Suggestion;
import com.codingdojo.exam.repositories.SuggestionRepository;

@Service
public class SuggestionService {
	@Autowired
	SuggestionRepository sRepo;

	public List<Suggestion> getAll() {
		return sRepo.findAll();
	}

	public void createSuggestion(Suggestion suggestion) {
		sRepo.save(suggestion);
	}

	public Suggestion getOneSuggestion(Long id) {
		Optional<Suggestion> optionalSuggestion = sRepo.findById(id);
		if (optionalSuggestion.isPresent()) {
			return optionalSuggestion.get();
		} else {
			return null;
		}
	}

	public Suggestion update(Suggestion suggestion) {
		return sRepo.save(suggestion);
	}

	public void deleteSuggestion(Long id) {
		sRepo.deleteById(id);
	}
}
