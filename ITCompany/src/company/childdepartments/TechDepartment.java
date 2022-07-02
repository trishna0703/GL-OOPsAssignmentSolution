package company.childdepartments;

import company.superdepartment.SuperDepartment;

// Techdepartment class extending super class
public class TechDepartment extends SuperDepartment {
	
	// overriding method to get department name in Tech department
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	
	// p=overriding method to get the work for the day in tech department
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	// overriding method to get work deadline in tech department
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//new method to get tech stack information
	public String getTechStackInformation() {
		return "Core Java";
	}
}
