package com.project.GraduationGuidelineBDBackEnd.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "UniversityOfficialInfo")
public class UniversityOfficialInfo {
	
	@Id
	@GeneratedValue
	private long universityID;
	private String fullName;
	private String shortName;
	private String uniType;
	private String uniCategory;
	private Date estDate;
	private String uniAddress;
	private String division;
	private String motto;
	private String chancellor;
	private String vc;
	private String contactNo;
	private String website;
	
	@OneToMany (targetEntity = FacultyInfo.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "universityID", referencedColumnName = "universityID")
	private List<FacultyInfo> faculty;
	
	public UniversityOfficialInfo() {
		
	}
	
	public UniversityOfficialInfo(long universityID, String fullName, String shortName, String uniType,
			String uniCategory, Date estDate, String uniAddress, String division, String motto, String chancellor,
			String vc, String contactNo, String website) {
		super();
		this.universityID = universityID;
		this.fullName = fullName;
		this.shortName = shortName;
		this.uniType = uniType;
		this.uniCategory = uniCategory;
		this.estDate = estDate;
		this.uniAddress = uniAddress;
		this.division = division;
		this.motto = motto;
		this.chancellor = chancellor;
		this.vc = vc;
		this.contactNo = contactNo;
		this.website = website;
	}
	
	public List<FacultyInfo> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<FacultyInfo> faculty) {
		this.faculty = faculty;
	}

	public long getUniversityID() {
		return universityID;
	}
	public void setUniversityID(long universityID) {
		this.universityID = universityID;
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
	public String getUniType() {
		return uniType;
	}
	public void setUniType(String uniType) {
		this.uniType = uniType;
	}
	public String getUniCategory() {
		return uniCategory;
	}
	public void setUniCategory(String uniCategory) {
		this.uniCategory = uniCategory;
	}
	public Date getEstDate() {
		return estDate;
	}
	public void setEstDate(Date estDate) {
		this.estDate = estDate;
	}
	public String getUniAddress() {
		return uniAddress;
	}
	public void setUniAddress(String uniAddress) {
		this.uniAddress = uniAddress;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
	public String getChancellor() {
		return chancellor;
	}
	public void setChancellor(String chancellor) {
		this.chancellor = chancellor;
	}
	public String getVc() {
		return vc;
	}
	public void setVc(String vc) {
		this.vc = vc;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website.toLowerCase();
	}
	
	
}
