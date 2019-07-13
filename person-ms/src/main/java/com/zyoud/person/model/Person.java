package com.zyoud.person.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "personId")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
