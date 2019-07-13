package com.zyoud.person.repository;

import org.springframework.data.repository.CrudRepository;

import com.zyoud.person.model.PersonName;

public interface PersonNameRepository extends CrudRepository<PersonName, Long> {

}
