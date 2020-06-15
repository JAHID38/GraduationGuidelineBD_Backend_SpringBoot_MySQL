package com.project.GraduationGuidelineBDBackEnd.repository;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.GraduationGuidelineBDBackEnd.entity.UniversityOfficialInfo;

public interface OfficialInfoRepo extends JpaRepository<UniversityOfficialInfo, Long> {

//	@Query(value = "select full_name, short_name from university_official_info")
//	public List<UniversityOfficialInfo> findByName();

}
