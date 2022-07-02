package company.childdepartments;

import company.superdepartment.SuperDepartment;

//HRdepartment class extending super class
public class HrDepartment extends SuperDepartment {
	
	//overriding method in HR department
	public String departmentName() {
		return "Welcome to HR Department";
	}
	
	//overriding method to get work in the HR department
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	// overriding method to get work deadline in hr department
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// new method defining activity to be done for the day
	public String doActivity() {
		return "Team Lunch";
	}

}
