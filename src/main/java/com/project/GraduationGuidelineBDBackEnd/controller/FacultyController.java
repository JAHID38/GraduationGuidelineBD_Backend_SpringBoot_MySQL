package com.project.GraduationGuidelineBDBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.GraduationGuidelineBDBackEnd.entity.FacultyInfo;
import com.project.GraduationGuidelineBDBackEnd.service.FacultyService;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService servcie;
	
	@PostMapping("register/faculty")
	public String createFaculty(@RequestBody FacultyInfo faculty) {
		 servcie.saveFaculty(faculty);
		 return faculty.getFullName()+ " (" +faculty.getShortName()+ ") has been created successfully!";
	}
	
	@GetMapping("view/{universityID}/faculty-list")
	public List<FacultyInfo> getFacultyList(@PathVariable Long universityID){
		return servcie.findFacultyByUniversityID(universityID);
	}
}
