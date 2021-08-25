package com.techapp.service;

public interface SuperService {
	
	public String departmentName();
	public String getTodaysWork();
	public String getWorkDeadline();
	default String isTodayAHoliday() {
		return "Today is not a holiday";
	};

}
