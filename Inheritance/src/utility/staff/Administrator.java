package utility.staff;

import office.staff.Emp;

public class Administrator extends Emp{
	private double allowance;
	
	public Administrator(){
		allowance = 1;
	}
	
	public Administrator(String name,int day, int month, int year, int empid, double salary,double allowance) {
		super(name, day, month, year, empid, salary);
		this.allowance = allowance;
	}
	
	public void display() {
		super.display();
		System.out.println("Allowance : "+allowance);
	}
}
