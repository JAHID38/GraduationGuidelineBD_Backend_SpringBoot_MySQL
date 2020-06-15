package com.project.GraduationGuidelineBDBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.GraduationGuidelineBDBackEnd.entity.UniversityOfficialInfo;
import com.project.GraduationGuidelineBDBackEnd.service.OfficialInfoService;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class OfficialInfoController {
	
	@Autowired
	private OfficialInfoService service;
	
	@PostMapping("/register/university")
	public String registerUniversity (@RequestBody UniversityOfficialInfo university) {
		service.createUniversity(university);
		return "Congratulations! "+ university.getFullName()
		+ " (" +university.getShortName() +") has been registered successfully";
	}
	
	@GetMapping("/view/official-info/{universityID}")
	public UniversityOfficialInfo getUniversityByID(@PathVariable long universityID) {
		return service.getUniversityByID(universityID);
	}
	
	@GetMapping("/view/university-list")
	public List<UniversityOfficialInfo> getUniversityList(){
		return service.getUniversityList();
	}
	
	@PutMapping("/update/official-info/{universityID}")
	public UniversityOfficialInfo updateUniversity(@PathVariable Long universityID,
			@RequestBody UniversityOfficialInfo university) {
		return service.updateUniversity(universityID, university);
	}
	
//	@GetMapping("/get-university-name")
//	public List<UniversityOfficialInfo> getUniversityName(){
//		return service.getUniversityName();
//	}
}
