package com.cap.dev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dev.entities.Application;
import com.cap.dev.entities.Participant;
import com.cap.dev.entities.Programs_Offered;
import com.cap.dev.services.AdministrationService;
import com.cap.dev.services.ApplicantService;
import com.cap.dev.services.MACService;


@RestController
public class AppController {

	@Autowired
	private ApplicantService applicantservice;

	@RequestMapping("/application")
	public List<Programs_Offered> viewPrograms() {
		return applicantservice.viewPrograms();
	}

	
	 @RequestMapping("/status/{application_id}") 
	 public Optional<Application> viewStatus(@PathVariable int application_id){ 
		 return applicantservice.viewStatus(application_id); 
		 }
	 
	@PostMapping("/apply")
	 public  Application apply(@RequestBody Application applications,@PathVariable Application app) {
		 return applicantservice.apply(app);
	 }
	
	/********************************MAC Services**********************************************/
	
	@Autowired
	private MACService macservice;
	
	
	 @RequestMapping("/viewapplications/{program_id}") 
	 public Application viewApplications(@RequestBody Application applications,@PathVariable int program_id) { 
		 return macservice.viewApplications(applications, program_id);
	 }
	 
	 @RequestMapping(method= RequestMethod.DELETE, value ="/updatestatus/{application_id}")
	 public void updateStatus(@RequestBody Application application, @PathVariable int application_id) throws Exception {
		 macservice.updateStatus(application_id,application);
	 	}
	 
	 @RequestMapping(method= RequestMethod.DELETE, value ="/confirmstatus/{application_id}")
	public void updateConfirmationStatus(@RequestBody Application application, @PathVariable int application_id ) {
		macservice.updateConfirmationStatus(application_id ,application);
	 
	}
	
	 /********************************Administration Services**********************************************/
		
	 
	 @Autowired
	 private AdministrationService administrationservice;
	 
	 @RequestMapping(method= RequestMethod.POST, value="/add")
	 public ResponseEntity<Programs_Offered> addPrograms(@RequestBody Programs_Offered programsoffered) throws Exception {
	 	Programs_Offered Programsofferedadded = administrationservice.addPrograms(programsoffered);
	 	
	 		return new ResponseEntity<Programs_Offered>(Programsofferedadded, HttpStatus.OK);

	 	}

	 @RequestMapping(method= RequestMethod.DELETE, value ="/delete/{program_id}")
	 public void deletePrograms(@PathVariable int program_id) throws Exception {
		 administrationservice.deletePrograms(program_id);
	 	}

	 @RequestMapping(method= RequestMethod.PUT, value ="/update/{program_id}" )
	 public void updatePrograms(@RequestBody Programs_Offered programsoffered, @PathVariable int program_id) throws Exception {
		 administrationservice.updatePrograms(program_id,programsoffered);
	 	}
	 
	 
	 
}
