package com.github.mickeydeeluffy.webflux.repository;

import com.github.mickeydeeluffy.webflux.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {
}
