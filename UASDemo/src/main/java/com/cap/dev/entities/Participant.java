package com.cap.dev.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participant {
@Id
	private int roll_no;
	private String email_id;
	private String application_id;
    private String scheduled_program_id;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getScheduled_program_id() {
		return scheduled_program_id;
	}
	public void setScheduled_program_id(String scheduled_program_id) {
		this.scheduled_program_id = scheduled_program_id;
	}
    
}
