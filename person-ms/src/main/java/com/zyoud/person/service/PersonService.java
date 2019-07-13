package com.zyoud.person.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zyoud.person.model.Person;
import com.zyoud.person.model.PersonName;
import com.zyoud.person.repository.PersonNameRepository;
import com.zyoud.person.repository.PersonRepository;
import com.zyoud.person.service.dto.PersonDTO;
import com.zyoud.person.service.dto.PersonNameDTO;
import com.zyoud.person.service.mapper.PersonMapper;

@Service
@Transactional
public class PersonService {

	private final PersonRepository personRepository;

	private final PersonNameRepository personNameRepository;

	private PersonMapper personMapper;

	public PersonService(PersonRepository personRepository, PersonNameRepository personNameRepository) {
		super();
		this.personRepository = personRepository;
		this.personNameRepository = personNameRepository;
	}

	public Person createPerson(@Valid PersonDTO personDTO) {

		Person person = personMapper.personDTOtoPerson(personDTO);
		personRepository.save(person);

		PersonNameDTO personNameDTO = personDTO.getPersonNameDTO();
		PersonName personName = personMapper.personNameDTOtoPersonName(personNameDTO);
		personName.setPerson(person);
		personNameRepository.save(personName);
		return person;
	}

	public PersonMapper getPersonMapper() {
		return personMapper;
	}

	@Autowired
	// @Qualifier(value = "mapConfig")
	@Qualifier("mapClass")
	public void setPersonMapper(PersonMapper personMapper) {

		this.personMapper = personMapper;
	}

}
