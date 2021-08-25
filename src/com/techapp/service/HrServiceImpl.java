 package com.techapp.service;

import com.techapp.model.HrDepartment;

public class HrServiceImpl implements HrService{
	
	HrDepartment hrDepartment = new HrDepartment("Hr Department");

	@Override
	public String departmentName() {
		return hrDepartment.getName();
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}


	public String doActivity() {
		return "team Lunch";
	}

}
