package company.departments;

public class AdminDepartment extends SuperDepartment{

	public String departmentName(){
		String msg = "Welcome to Admin Department";
		System.out.println(msg);
		return msg;
	}
	
	public String getTodaysWork(){
		String msg = "Complete your documents Submission";
		System.out.println(msg);
		return msg;
	}
	
	public String getWorkDeadline(){
		String msg = "Complete by EOD";
		System.out.println(msg);
		return msg;
	}

}
