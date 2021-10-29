package com.employe.Employesearch;

import org.springframework.stereotype.Component;

@Component
public class EmployeModel {
	
	public EmployeModel()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int id;

}
