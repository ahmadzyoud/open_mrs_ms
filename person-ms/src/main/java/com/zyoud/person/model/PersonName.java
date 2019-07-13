package com.zyoud.person.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "personNameId")
public class PersonName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personNameId;

	private Boolean preferred;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	private String prefix;

	private String givenName;

	private String middleName;

	private String familyNamePrefix;

	private String familyName;

	private String familyName2;

	private String familyNameSuffix;

	private String degree;

	private Long creator;

	private Date dateCreated;

	private Boolean voided;

	private Long voidedBy;

	private Date dateVoided;

	private String voidReason;

	private Long changed_by;

	private Date dateChanged;

	private String uuid;

}
