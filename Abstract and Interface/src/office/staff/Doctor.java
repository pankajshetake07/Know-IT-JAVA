package office.staff;

import office.utility.Person;

public class Doctor extends Person {
	private String degree;
	private int regNo;
	private double salary;
	
	public Doctor() {
		super();
	}

	public Doctor(String name, int day, int month, int year, String degree, int regNo, double salary) {
		super(name, day, month, year);
		this.degree = degree;
		this.regNo = regNo;
		this.salary = salary;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Degree : "+degree);
		System.out.println("Reg No : "+regNo);
		System.out.println("Salary : "+salary);
	}

	@Override
	public String toString() {
		return super.toString() + "\nDegree : "+degree + "\nReg No : "+regNo + "\nSalary : "+salary;
	}
	
}
