package com.project.GraduationGuidelineBDBackEnd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class FacultyInfo {

	@Id
	@GeneratedValue
	private Long facultyID;
	private String fullName;
	private String shortName;
	private String dean;
	private Long universityID;

	public FacultyInfo(Long facultyID, String fullName, String shortName, String dean, Long universityID) {
		super();
		this.facultyID = facultyID;
		this.fullName = fullName;
		this.shortName = shortName;
		this.dean = dean;
		this.universityID = universityID;
	}

	public Long getUniversityID() {
		return universityID;
	}

	public void setUniversityID(Long universityID) {
		this.universityID = universityID;
	}

	public FacultyInfo() {
		super();
	}

	public Long getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(Long facultyID) {
		this.facultyID = facultyID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName.toUpperCase();
	}

	public String getDean() {
		return dean;
	}

	public void setDean(String dean) {
		this.dean = dean;
	}

}
