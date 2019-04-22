package com.cap.dev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dev.entities.Programs_Offered;
import com.cap.dev.repositries.ProgramsOfferedRepo;


@Service
public class AdministrationService {
@Autowired
	private ProgramsOfferedRepo programsofferedrepo;
	
	public Programs_Offered addPrograms(Programs_Offered programsoffered) {
		return programsofferedrepo.save(programsoffered);
	}

	public void deletePrograms(int program_id) {
	
		programsofferedrepo.delete(program_id);;
	}

	public void updatePrograms(int program_id, Programs_Offered programsoffered) {
		
		programsofferedrepo.save(programsoffered);
		
	}

	

}
