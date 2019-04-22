package com.cap.dev.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.dev.entities.Participant;

public interface ParticipantRepo extends JpaRepository<Participant, Integer>{

	static Object save(int application_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
