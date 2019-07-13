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
@EqualsAndHashCode(of = "personNameId")
@JGlobalMap
public class PersonNameDTO {
	private Long personNameId;

	private Boolean preferred;

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

	public Long getPersonNameId() {
		return personNameId;
	}

	public void setPersonNameId(Long personNameId) {
		this.personNameId = personNameId;
	}

	public Boolean getPreferred() {
		return preferred;
	}

	public void setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyNamePrefix() {
		return familyNamePrefix;
	}

	public void setFamilyNamePrefix(String familyNamePrefix) {
		this.familyNamePrefix = familyNamePrefix;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilyName2() {
		return familyName2;
	}

	public void setFamilyName2(String familyName2) {
		this.familyName2 = familyName2;
	}

	public String getFamilyNameSuffix() {
		return familyNameSuffix;
	}

	public void setFamilyNameSuffix(String familyNameSuffix) {
		this.familyNameSuffix = familyNameSuffix;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getVoided() {
		return voided;
	}

	public void setVoided(Boolean voided) {
		this.voided = voided;
	}

	public Long getVoidedBy() {
		return voidedBy;
	}

	public void setVoidedBy(Long voidedBy) {
		this.voidedBy = voidedBy;
	}

	public Date getDateVoided() {
		return dateVoided;
	}

	public void setDateVoided(Date dateVoided) {
		this.dateVoided = dateVoided;
	}

	public String getVoidReason() {
		return voidReason;
	}

	public void setVoidReason(String voidReason) {
		this.voidReason = voidReason;
	}

	public Long getChanged_by() {
		return changed_by;
	}

	public void setChanged_by(Long changed_by) {
		this.changed_by = changed_by;
	}

	public Date getDateChanged() {
		return dateChanged;
	}

	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
