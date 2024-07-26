package com.codingdojo.exam.repositories;

import java.util.List;


import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.exam.models.Game;


@Repository
public interface GameRepository extends ListCrudRepository<Game, Long>{
	List<Game> findAllByOrderByNameAsc();
}
