package com.zyoud.person.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zyoud.person.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
