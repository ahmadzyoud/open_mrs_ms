package com.zyoud.person.service.mapper;

import com.zyoud.person.model.Person;
import com.zyoud.person.model.PersonName;
import com.zyoud.person.service.dto.PersonDTO;
import com.zyoud.person.service.dto.PersonNameDTO;

public interface PersonMapper {

	PersonDTO personToPersonDTO(Person person);

	PersonName personNameDTOtoPersonName(PersonNameDTO personNameDTO);

	Person personDTOtoPerson(PersonDTO personDTO);

	PersonNameDTO personNameToPersonNameDTO(PersonName personName);

}
