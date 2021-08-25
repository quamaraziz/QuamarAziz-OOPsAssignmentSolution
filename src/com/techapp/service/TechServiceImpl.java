package com.techapp.service;

import com.techapp.model.TechDepartment;

public class TechServiceImpl implements TechService {
	TechDepartment techDepartment = new TechDepartment("Tech Department");

	@Override
	public String departmentName() {
		return techDepartment.getName();
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "core Java";
	}

}
