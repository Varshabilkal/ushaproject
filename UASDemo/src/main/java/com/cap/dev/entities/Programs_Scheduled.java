package com.cap.dev.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programs_Scheduled {
	@Id
	private String scheduled_program_id;
	private String  program_name;
	private String location;
	private String start_date;
	private String end_date;
	private int sessions_per_week;
	
	public String getScheduled_program_id() {
		return scheduled_program_id;
	}
	public void setScheduled_program_id(String scheduled_program_id) {
		this.scheduled_program_id = scheduled_program_id;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getSessions_per_week() {
		return sessions_per_week;
	}
	public void setSessions_per_week(int sessions_per_week) {
		this.sessions_per_week = sessions_per_week;
	}
	
	

}
