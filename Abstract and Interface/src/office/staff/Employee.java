package office.staff;

import office.utility.Person;

public abstract class Employee extends Person {
	private int empId;
	protected double salary;
	
	public Employee() {
		super();
		empId = 1;
		salary = 0.0;
	}

	public Employee(String name, int day, int month, int year, int empId, double salary) {
		super(name, day, month, year);
		this.empId = empId;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Salary : "+salary);
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee Id : "+empId +"\n"+ "Employee Salary : "+salary;
	}
	
	public abstract double calSalary();
	
}
