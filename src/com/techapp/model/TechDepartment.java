package com.techapp.model;

public class TechDepartment {
	private String name;

	public TechDepartment(String name) {
		super();
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
		return "TechDepartment [name=" + name + "]";
	}
	
	
}
