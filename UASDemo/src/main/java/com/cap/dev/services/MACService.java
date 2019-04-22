package com.cap.dev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dev.entities.Application;
import com.cap.dev.entities.Participant;
import com.cap.dev.entities.Programs_Offered;
import com.cap.dev.repositries.ApplicantRepo;
import com.cap.dev.repositries.ParticipantRepo;


@Service
public class MACService{
	
	@Autowired
	private  ApplicantRepo applicantrepo;
	
	@Autowired
	private ParticipantRepo participantrepo;

public Application viewApplications(Application applications, int program_id) { 
	return applicantrepo.findAll(applications); 
	}

public Application updateStatus(int application_id, Application application) {
	return applicantrepo.save(application);
}


public Object updateConfirmationStatus(int application_id, Application application) {
	if(Application.getStatus().equals("confirmed")) {
		return ParticipantRepo.save(application_id);
	}
	else
	{
		return null;
	}
	}
}


