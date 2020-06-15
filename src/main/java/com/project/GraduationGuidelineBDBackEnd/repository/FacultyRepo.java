package com.project.GraduationGuidelineBDBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.GraduationGuidelineBDBackEnd.entity.FacultyInfo;

public interface FacultyRepo extends JpaRepository<FacultyInfo, Long>{

	List<FacultyInfo> findFacultyByUniversityID(Long universityID);

}
