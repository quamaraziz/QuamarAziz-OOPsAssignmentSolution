package com.techapp.service;

import com.techapp.model.AdminDepartment;

public class AdminServiceImpl implements AdminService {
	
	AdminDepartment adminDepartment = new AdminDepartment("Admin Department");

	@Override
	public String departmentName() {
		return adminDepartment.getName();
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}


}
