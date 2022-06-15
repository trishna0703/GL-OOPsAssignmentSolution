package company.departments;

public class Driver {

	public static void main(String[] args) {
		
		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		
		System.out.println(" ");
		
		hr.departmentName();
		((HrDepartment) hr).doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		System.out.println(" ");
		
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		((TechDepartment) tech).getTechStackInformation();
		tech.isTodayAHoliday();
	}

}
