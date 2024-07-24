package com.codingdojo.exam.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.codingdojo.exam.models.Game;

public interface GameRepository extends ListCrudRepository<Game, Long>{
}
