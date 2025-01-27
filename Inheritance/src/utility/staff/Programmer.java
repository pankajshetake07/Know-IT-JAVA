package utility.staff;

import office.staff.Emp;

public class Programmer extends Emp{
	private String projectTitle;
	private int extraHours;
	private int chargesPerExtraHours;
	
	public Programmer() {
		projectTitle = "abc";
		extraHours = 1;
		chargesPerExtraHours = 100;
	}

	public Programmer(String name,int day, int month, int year, int empid, double salary, String projectTitle, int extraHours, int chargesPerExtraHours) {
		super(name, day, month, year, empid, salary);
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHours = chargesPerExtraHours;
	}
	
	public void display() {
		super.display();
		System.out.println("Project title : "+projectTitle);
		System.out.println("Extra Hours : "+extraHours);
		System.out.println("Charges Per Extra Hours : "+chargesPerExtraHours);
	}
}
