package com.greatLearning.Assesment1;

public class Main {
	public static void main(String[] args) {
		
		SuperDepartment superdepartment = new SuperDepartment();
		superdepartment.departmentName();
		superdepartment.getTodaysWork ();
		superdepartment .getWorkDeadline();
		superdepartment.isTodayAHoliday();
		
		
		AdminDepartment admin = new AdminDepartment();
		admin.departmentName();
		admin.getTodaysWork ();
		admin .getWorkDeadline();
		
		HrDepartment hr = new HrDepartment();
		hr.departmentName();
		hr.getTodaysWork ();
		hr.doActivity();
		
		TechDepartment tech = new TechDepartment();
		tech.departmentName();
		tech.getTodaysWork ();
		tech .getTechStackInformation();
		
	}
		
	}
}
