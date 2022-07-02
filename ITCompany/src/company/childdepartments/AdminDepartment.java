package company.childdepartments;

import company.superdepartment.SuperDepartment;

// Admin class extending super class
public class AdminDepartment extends SuperDepartment{
	
	//overriding department method for getting department name
	public String departmentName(){	
		return "Welcome to Admin Department";
	}
	
	//overriding method to get the work of the day in admin department
	public String getTodaysWork(){
		return "Complete your documents Submission";
	}
	
	// overriding method to get deadline of the work
	public String getWorkDeadline(){
		return "Complete by EOD";
	}

}
