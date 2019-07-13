package com.zyoud.person.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyoud.person.model.Person;
import com.zyoud.person.repository.PersonRepository;
import com.zyoud.person.service.PersonService;
import com.zyoud.person.service.dto.PersonDTO;

@RestController
@RequestMapping("/api")
public class PersonController {

	private final PersonService personService;

	private final PersonRepository personRepository;

	public PersonController(PersonService personService, PersonRepository personRepository) {
		super();
		this.personService = personService;
		this.personRepository = personRepository;
	}

	@PostMapping("person")
	public ResponseEntity<Person> addNewPerson(@Valid @RequestBody PersonDTO personDTO) throws URISyntaxException {
		if (personDTO.getPersonId() != null) {
			throw new RuntimeException("A new person cannot already have an ID");
		}
		Person person = personService.createPerson(personDTO);
		return ResponseEntity.created(new URI("/api/person" + person.getPersonId())).body(person);

	}

}
