package com.cap.dev.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.dev.entities.Programs_Offered;

public interface ProgramsOfferedRepo extends JpaRepository<Programs_Offered, String>{

	void delete(int program_id);

	

	

}
