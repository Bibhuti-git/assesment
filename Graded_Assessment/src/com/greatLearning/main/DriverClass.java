package com.greatLearning.main;

import Department.SuperDepartment;
import Department.SuperDepartment.Admin_Department;
import Department.SuperDepartment.Admin_Department.Hr_Department;
import Department.SuperDepartment.Admin_Department.Hr_Department.Tech_Department;

public class DriverClass {
	class Main {
		public void main(String[] args) {

			// create an object of the subclass
			SuperDepartment AdminDepartment = new Admin_Department();

			AdminDepartment.departmentname();
			AdminDepartment.getTodaysWork();
			AdminDepartment.getWorkDeadline();
			AdminDepartment.isTodayAHoliday();

			SuperDepartment HRDepartment = new Hr_Department();

			HRDepartment.departmentname();
			HRDepartment.getTodaysWork();
			HRDepartment.getWorkDeadline();
			HRDepartment.isTodayAHoliday();

			SuperDepartment TechDepartment = new Tech_Department();

			TechDepartment.departmentname();
			TechDepartment.getTodaysWork();
			TechDepartment.getWorkDeadline();
			TechDepartment.isTodayAHoliday();

		}

	}
}
