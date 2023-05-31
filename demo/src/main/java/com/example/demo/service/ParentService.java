package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Parent;
import com.example.demo.exceptions.NullEmailFoundException;
import com.example.demo.exceptions.NullUserFound;


public interface ParentService {
	
	public Parent registerParent(Parent parent) throws NullUserFound, NullEmailFoundException;
	
	public List<Parent> getAllParents();
	
	public Parent getParentById(Integer pid) throws NullUserFound;
	
	public Parent updateParent(Parent parent) throws NullUserFound;
	
	public String deleteParent(Parent parent) throws NullUserFound;
	
	public Parent loginParent(String email, String password) throws NullUserFound;

}