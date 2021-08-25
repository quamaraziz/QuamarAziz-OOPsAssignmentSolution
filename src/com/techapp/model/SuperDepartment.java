package com.techapp.model;

public class SuperDepartment {
	private String name;

	public SuperDepartment(String name) {
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
		return "SuperDepartment [name=" + name + "]";
	}

}
