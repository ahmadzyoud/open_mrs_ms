package com.zyoud.person.service.mapper.impl;

import org.springframework.stereotype.Component;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.zyoud.person.model.Person;
import com.zyoud.person.model.PersonName;
import com.zyoud.person.service.dto.PersonDTO;
import com.zyoud.person.service.dto.PersonNameDTO;
import com.zyoud.person.service.mapper.PersonMapper;

@Component(value = "mapClass")
public class PersonMaperImpl implements PersonMapper {

	private JMapper<Person, PersonDTO> personMapper;
	private JMapper<PersonName, PersonNameDTO> personNameMapper;

	public PersonMaperImpl() {

		System.out.println("1111111111111111111111111111111111 MAPPER 1");

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
