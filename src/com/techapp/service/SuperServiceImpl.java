package com.techapp.service;

import com.techapp.model.SuperDepartment;

public class SuperServiceImpl implements SuperService{
	
	SuperDepartment superDepartment = new SuperDepartment("Super Department");


	public String departmentName() {
		return superDepartment.getName();
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

}
