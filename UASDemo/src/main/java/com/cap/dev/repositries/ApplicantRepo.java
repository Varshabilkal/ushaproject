package com.cap.dev.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.dev.entities.Application;
import com.cap.dev.entities.Programs_Offered;

@Repository
public interface ApplicantRepo extends JpaRepository<Application, Integer>{

	

	Application findAll(Application applications);

}
