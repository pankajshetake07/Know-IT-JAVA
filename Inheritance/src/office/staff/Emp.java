package office.staff;
import java.io.Serializable;

import office.utility.Person;

public class Emp extends Person implements Serializable{
	private int empid;
	private double salary;
	
	public Emp(){
		//super();
		empid = 1;
		salary = 0.0;
	}
	
	public Emp(String name,int day, int month, int year, int empid, double salary) {
		super(name, day, month, year);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Salry : "+salary);
	}

}
