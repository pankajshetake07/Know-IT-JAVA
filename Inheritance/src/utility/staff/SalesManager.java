package utility.staff;

import office.staff.Emp;

public class SalesManager extends Emp{
	private double salesTarget;
	private double perCommision;
	
	public SalesManager(){
		salesTarget = 10.0;
		perCommision = 7.8;
	}
	
	public SalesManager(String name,int day, int month, int year, int empid, double salary,double salesTarget, double perCommision) {
		super(name, day, month, year, empid, salary);
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Target : "+salesTarget);
		System.out.println("Commision : "+perCommision);
	}
}
