package com.cap.dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dev.entities.Application;
import com.cap.dev.entities.Programs_Offered;
import com.cap.dev.repositries.ApplicantRepo;
import com.cap.dev.repositries.ProgramsOfferedRepo;

@Service
public class ApplicantService {
	
	@Autowired
	private  ApplicantRepo applicantrepo;
	
	@Autowired
	private ProgramsOfferedRepo programsofferedrepo;
	
	public List<Programs_Offered> viewPrograms() {
		return programsofferedrepo.findAll();
	}
	
	public Optional<Application> viewStatus(int application_id) {
		
		return applicantrepo.findById(application_id);
	}

	public Application apply(Application app) {
		return applicantrepo.save(app);
	} 
	 
}
