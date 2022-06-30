package company.driver;

import company.childdepartments.AdminDepartment;
import company.childdepartments.HrDepartment;
import company.childdepartments.TechDepartment;
import company.superdepartment.SuperDepartment;

public class Driver {

	public static void main(String[] args) {
		
		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(hr.departmentName());
		System.out.println(((HrDepartment) hr).doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(((TechDepartment) tech).getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
