package com.zyoud.person.service.dto;

import java.util.Date;

import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "personId")
@JGlobalMap(excluded = "personNameDTO")
public class PersonDTO {

	private Long personId;

	private String gender;

	private Date birthdate;

	private Boolean dead;

	private Date deathDate;

	private Long causeOfDeath;

	private Long creator;

	private Date dateCreated;

	private Long changedBy;

	private Date dateChanged;

	private Boolean voided;

	private Date dateVoided;

	private String voidReason;

	private String uuid;

	private PersonNameDTO personNameDTO;

}
