package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Tutor;
import com.example.demo.exceptions.NullEmailFoundException;
import com.example.demo.exceptions.NullUserFound;

public interface TutorService {
	
	public Tutor registerTutor(Tutor tutor) throws NullUserFound, NullEmailFoundException;
	
	public List<Tutor> getAllTutors();
	
	public Tutor getTutorById(Integer pid) throws NullUserFound;
	
	public Tutor updateTutor(Tutor tutor) throws NullUserFound;
	
	public String deleteTutor(Tutor tutor) throws NullUserFound;
	
	public Tutor loginTutor(String email, String password) throws NullUserFound;

	
	
}