package app;

import office.staff.Admin;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class EmpDemo {
//	public static void showMoreDetails(Employee[]e) {
//		for(int i=0; i<e.length; i++) {
//			if(e[i] instanceof SalesManager)
//				System.out.print("\tSales Target : "+((SalesManager)e[i]).getSalesTarget());
//			if(e[i] instanceof Programmer)
//				System.out.println("\tProject title : "+((Programmer) e[i]).getProjectTitle());
//			if(e[i] instanceof Admin)
//				System.out.println("\tBonus : "+((Admin) e[i]).getBonus());
//		}
//	}

	
	public static void main(String args[]) {
//		Employee [] emp = new Employee[3];
//		emp[0] = new SalesManager("pankaj",19,03,2002,101,15000,100,7.9);
//		emp[1] = new Programmer("Arjun",10,10,1700,102,20000,"ToDo List",5,350);
//		emp[2] = new Admin("Krishn",20,20,1600,103,25000,5000);
//		System.out.println(emp[0] + "\n" + "Salary of Sales Manager : " + emp[0].calSalary());
//		System.out.println("---------------------------------------------");
//		System.out.println(emp[1] + "\n" + "Salary of Programmer : " + emp[1].calSalary());
//		System.out.println("---------------------------------------------");
//		System.out.println(emp[2] + "\n" + "Salary of Admin : " + emp[2].calSalary());
//		System.out.println("---------------------------------------------");
		
//		showMoreDetails(emp);
		
		Employee [] emp = new Employee[3];
		emp[0] = new SalesManager("pankaj",19,03,2002,101,15000,100,7.9, "ABCD123", 20);
		emp[1] = new Programmer("Arjun",10,10,1700,102,20000,"ToDo List",5,350, "WXYZ",30);
		emp[2] = new Admin("Krishn",20,20,1600,103,25000,5000);
		System.out.println(emp[0] + "\n" + "Salary of Sales Manager : " + emp[0].calSalary());
		System.out.println("---------------------------------------------");
		System.out.println(emp[1] + "\n" + "Salary of Programmer : " + emp[1].calSalary());
		System.out.println("---------------------------------------------");
		System.out.println(emp[2] + "\n" + "Salary of Admin : " + emp[2].calSalary());
		System.out.println("---------------------------------------------");
		
		System.out.println("Travelling allowance");
		for(int i=0; i<emp.length; i++) {
			if(emp[i] instanceof ITraveller) {
				System.out.print("Employee id : "+emp[i].getEmpId());
				if(emp[i] instanceof SalesManager) {
					System.out.print("\tPassport Details : "+((SalesManager)emp[i]).getPassportDetails());
					System.out.print("\tTravel Hours : "+((SalesManager)emp[i]).getTravelHours());
				} 
				else if (emp[i] instanceof Programmer) 
				{
					System.out.print("\tPassport Details : "+((Programmer)emp[i]).getPassportDetails());
					System.out.print("\t\tTravel Hours : "+((Programmer)emp[i]).getTravelHours());
				}
				System.out.print("\tTA : " + ((ITraveller)emp[i]).calculateTA());
			}
			System.out.println();
		}
		
	}
}
