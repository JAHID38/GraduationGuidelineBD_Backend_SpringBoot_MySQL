package com.project.GraduationGuidelineBDBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.GraduationGuidelineBDBackEnd.entity.UniversityOfficialInfo;
import com.project.GraduationGuidelineBDBackEnd.repository.OfficialInfoRepo;

@Service
public class OfficialInfoService {
	
	@Autowired
	private OfficialInfoRepo repo;
	
	public UniversityOfficialInfo createUniversity(UniversityOfficialInfo university) {
		return repo.save(university);
	}
	
	public UniversityOfficialInfo getUniversityByID(long universityID) {
		return repo.findById(universityID).orElse(null);
	}
	
	public List<UniversityOfficialInfo> getUniversityList(){
		return repo.findAll();
	}
	
	public UniversityOfficialInfo updateUniversity(Long universityID, UniversityOfficialInfo university) {
		UniversityOfficialInfo uniInfo = repo.findById(universityID).orElse(null);
		uniInfo.setFullName(university.getFullName());
		uniInfo.setShortName(university.getShortName());
		uniInfo.setUniType(university.getUniType());
		uniInfo.setUniCategory(university.getUniCategory());
		uniInfo.setEstDate(university.getEstDate());
		uniInfo.setUniAddress(university.getUniAddress());
		uniInfo.setDivision(university.getDivision());
		uniInfo.setMotto(university.getMotto());
		uniInfo.setChancellor(university.getChancellor());
		uniInfo.setVc(university.getVc());
		uniInfo.setContactNo(university.getContactNo());
		uniInfo.setWebsite(university.getWebsite());
		
		return repo.save(uniInfo);
	}
	
//	public List<UniversityOfficialInfo> getUniversityName(){
//		return repo.findByName();
//	}

}
