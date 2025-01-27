package apps;
import office.staff.Emp;
import utility.staff.Administrator;
import utility.staff.Programmer;
import utility.staff.SalesManager;
public class EmpDemo {

	public static void main(String[] args) {
		//Assignment no 1
//		Emp e = new Emp();
//		e.display();
//		System.out.println("**************");
//		Emp e2 = new Emp("krishn", 2, 2, 1000, 101, 120000.0); 
//		e2.display();
		
		
		//Assignment 2;
		Emp e = new SalesManager("arjun", 3,3,3521,101,12000, 15,7.9);
		e.display();
		System.out.println("******************");
		Emp e1 = new Programmer("arjun", 3,3,3521,101,12000, "TODO", 12, 300);
		e1.display();
		System.out.println("******************");
		Emp e2 = new Administrator("arjun", 3,3,3521,101,12000, 14000);
		e2.display();
	}
}
