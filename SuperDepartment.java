package company.departments;

public class SuperDepartment {

	public String departmentName(){
		String msg = "Super Department";
		System.out.println(msg);
		return msg;
	}
	
	public String getTodaysWork(){
		String msg = "No Work as of now";
		System.out.println(msg);
		return msg;
	}
	
	public String getWorkDeadline(){
		String msg = "Nil";
		System.out.println(msg);
		return msg;
	}
	
	public String isTodayAHoliday(){
		String msg = "Today is not a holiday";
		System.out.println(msg);
		return msg;
	}

	
}
