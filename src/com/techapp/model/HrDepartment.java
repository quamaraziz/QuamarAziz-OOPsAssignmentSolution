package com.techapp.model;

public class HrDepartment{
	private String name;

	public HrDepartment(String name) {
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
		return "HrDepartment [name=" + name + "]";
	}
	
	
	
	
}
