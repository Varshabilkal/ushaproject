package com.cap.dev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 1000)
public class Programs_Offered {
@Id	
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private int program_id;
public int getProgram_id() {
	return program_id;
}
public void setProgram_id(int program_id) {
	this.program_id = program_id;
}
private String program_name;
private String description;
private String applicant_eligibility;
public int duration;
public String degree_certificate_offered;


public String getProgram_name() {
	return program_name;
}
public void setProgram_name(String program_name) {
	this.program_name = program_name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getApplicant_eligibility() {
	return applicant_eligibility;
}
public void setApplicant_eligibility(String applicant_eligibility) {
	this.applicant_eligibility = applicant_eligibility;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getDegree_certificate_offered() {
	return degree_certificate_offered;
}
public void setDegree_certificate_offered(String degree_certificate_offered) {
	this.degree_certificate_offered = degree_certificate_offered;
}

}
