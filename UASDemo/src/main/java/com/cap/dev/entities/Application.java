package com.cap.dev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 100)
public class Application {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int application_id;
	private String full_name;
	private String date_of_birth;
	private String highest_qualification;
	private double marks_obtained;
	private String  goals;
	private String email_id;
	private String scheduled_program_id;
	private static String status="applied";
	private String date_of_interview=null;
	
	
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	public double getMarks_obtained() {
		return marks_obtained;
	}
	public void setMarks_obtained(double marks_obtained) {
		this.marks_obtained = marks_obtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getScheduled_program_id() {
		return scheduled_program_id;
	}
	public void setScheduled_program_id(String scheduled_program_id) {
		this.scheduled_program_id = scheduled_program_id;
	}
	public static String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate_of_interview() {
		return date_of_interview;
	}
	public void setDate_of_interview(String date_of_interview) {
		this.date_of_interview = date_of_interview;
	}
	

}
