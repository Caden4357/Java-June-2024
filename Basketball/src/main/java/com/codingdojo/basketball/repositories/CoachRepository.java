package com.codingdojo.basketball.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.basketball.models.Coach;

@Repository
public interface CoachRepository extends ListCrudRepository<Coach, Long> {
}
