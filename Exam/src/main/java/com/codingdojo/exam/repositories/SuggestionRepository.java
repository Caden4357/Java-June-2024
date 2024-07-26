package com.codingdojo.exam.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.exam.models.Suggestion;

@Repository
public interface SuggestionRepository extends ListCrudRepository<Suggestion, Long> {
}
