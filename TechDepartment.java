package company.departments;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String msg = "Welcome to Tech Department";
		System.out.println(msg);
		return msg;
	}

	public String getTodaysWork() {
		String msg = "Complete coding of module 1";
		System.out.println(msg);
		return msg;
	}

	public String getWorkDeadline() {
		String msg = "Complete by EOD";
		System.out.println(msg);
		return msg;
	}
	
	public String getTechStackInformation() {
		String msg = "Core Java";
		System.out.println(msg);
		return msg;
	}
}
