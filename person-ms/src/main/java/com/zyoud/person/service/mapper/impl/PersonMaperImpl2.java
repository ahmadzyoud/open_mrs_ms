package com.zyoud.person.service.mapper.impl;

import org.springframework.stereotype.Component;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.IJMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.zyoud.person.model.Person;
import com.zyoud.person.model.PersonName;
import com.zyoud.person.service.dto.PersonDTO;
import com.zyoud.person.service.dto.PersonNameDTO;
import com.zyoud.person.service.mapper.PersonMapper;

@Component(value = "mapClass2")
public class PersonMaperImpl2 implements PersonMapper {

	private IJMapper<Person, PersonDTO> personMapper;
	private IJMapper<PersonName, PersonNameDTO> personNameMapper;

	public PersonMaperImpl2() {

		System.out.println("222222222222222222222222222 Mapper2");

		JMapperAPI personApi = new JMapperAPI().add(JMapperAPI.mappedClass(Person.class));
		personMapper = new JMapper(Person.class, PersonDTO.class, personApi);

		JMapperAPI personNameApi = new JMapperAPI().add(JMapperAPI.mappedClass(PersonName.class));
		personNameMapper = new JMapper(PersonName.class, PersonNameDTO.class, personNameApi);
	}

	@Override
	public PersonDTO personToPersonDTO(Person person) {

		return null;
	}

	@Override
	public PersonName personNameDTOtoPersonName(PersonNameDTO personNameDTO) {
		return personNameMapper.getDestination(personNameDTO);
	}

	@Override
	public Person personDTOtoPerson(PersonDTO personDTO) {

		return personMapper.getDestination(personDTO);
	}

	@Override
	public PersonNameDTO personNameToPersonNameDTO(PersonName personName) {
		return null;
	}

}
