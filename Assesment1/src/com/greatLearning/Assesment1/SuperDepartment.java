package com.greatLearning.Assesment1;

public class SuperDepartment {
	void departmentName() {
		System.out.println("Welcome to Super Department");
	}

	public void getTodaysWork() {
		System.out.println("No Work as of now");
	}

	public void getWorkDeadline() {
		System.out.println("Nil");
	}

	public void isTodayAHoliday() {
		System.out.println("Today is not a holiday");
	}

	class AdminDepartment extends SuperDepartment {
		void departmentName() {
			System.out.println("Admin Department");
		}

		public void getTodaysWork() {
			System.out.println("Complete your documents Submission");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}

	}

	class HrDepartment extends SuperDepartment {
		void departmentName() {
			System.out.println("HR Department");
		}

		public void getTodaysWork() {
			System.out.println("Fill today’s worksheet and mark your attendance");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}

		public void doActivity() {
			System.out.println("team Lunch");
		}
	}

	class TechDepartment extends SuperDepartment {
		void departmentName() {
			System.out.println("Tech Department");
		}

		public void getTodaysWork() {
			System.out.println(" Complete coding of module 1");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}

		public void getTechStackInformation() {
			System.out.println("core java");
		}
	}

}
