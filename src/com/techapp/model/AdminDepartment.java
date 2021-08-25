package com.techapp.model;

public class AdminDepartment{
	private String name;

	public AdminDepartment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AdminDepartment [name=" + name + "]";
	}
	
	
	
}
