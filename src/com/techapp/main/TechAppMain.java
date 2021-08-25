package com.techapp.main;

import com.techapp.service.AdminService;
import com.techapp.service.AdminServiceImpl;
import com.techapp.service.HrService;
import com.techapp.service.HrServiceImpl;
import com.techapp.service.SuperService;
import com.techapp.service.SuperServiceImpl;
import com.techapp.service.TechService;
import com.techapp.service.TechServiceImpl;

public class TechAppMain {

	public static void main(String[] args) {
		
//	SuperDepartment
		SuperService obj3 = new SuperServiceImpl();
		System.out.println("Welcome to "+obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.isTodayAHoliday());
		System.out.println();
	
//	AdminDepartment	
		 AdminService obj2 = new AdminServiceImpl();
		 System.out.println("Welcome to "+obj2.departmentName());
		 System.out.println(obj2.getTodaysWork());
		 System.out.println(obj2.getWorkDeadline());
		 System.out.println(obj2.isTodayAHoliday());
		 System.out.println();

//	HrDepartment	 
		 HrService obj1 = new HrServiceImpl();
		 System.out.println("Welcome to "+obj1.departmentName());
		 System.out.println(obj1.doActivity());
		 System.out.println(obj1.getTodaysWork());
		 System.out.println(obj1.getWorkDeadline());
		 System.out.println(obj1.isTodayAHoliday());
		 System.out.println();

//	TechDepartment		 
		 TechService obj4 = new TechServiceImpl();
		 System.out.println("Welcome to "+obj4.departmentName());
		 System.out.println(obj4.getTechStackInformation());
		 System.out.println(obj4.getTodaysWork());
		 System.out.println(obj4.getWorkDeadline());
		 System.out.println(obj4.isTodayAHoliday());

	}

}
