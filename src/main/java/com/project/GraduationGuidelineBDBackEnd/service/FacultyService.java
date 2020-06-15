package com.project.GraduationGuidelineBDBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.GraduationGuidelineBDBackEnd.entity.FacultyInfo;
import com.project.GraduationGuidelineBDBackEnd.repository.FacultyRepo;

@Service
public class FacultyService {
	
	@Autowired
	private FacultyRepo repo;
	
	public FacultyInfo saveFaculty (FacultyInfo faculty) {
		return repo.save(faculty);
	}
	
	public List<FacultyInfo> findFacultyByUniversityID(Long universityID){
		return repo.findFacultyByUniversityID(universityID);
	}

}
