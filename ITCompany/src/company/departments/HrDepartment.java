package company.departments;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String msg = "Welcome to HR Department";
		System.out.println(msg);
		return msg;
	}

	public String getTodaysWork() {
		String msg = "Fill today’s timesheet and mark your attendance";
		System.out.println(msg);
		return msg;
	}

	public String getWorkDeadline() {
		String msg = "Complete by EOD";
		System.out.println(msg);
		return msg;
	}
	
	public String doActivity() {
		String msg = "Team Lunch";
		System.out.println(msg);
		return msg;
	}

}
