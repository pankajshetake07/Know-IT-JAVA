package office.staff;

import office.utility.ITraveller;

public class Programmer extends Employee implements ITraveller {
	private String projectTitle;
	private double extraHours;
	private double chargesPerHours;
	private String passportDetails;
	private int travelHours;
	public Programmer() {
		super();
		projectTitle = "xyz";
		extraHours = 1.0;
		chargesPerHours = 0.0;
		passportDetails = "abc";
		travelHours = 0;
	}

	public Programmer(String name, int day, int month, int year, int empId, double salary, String projectTitle,
			double extraHours, double chargesPerHours,String passportDetails, int travelHours) {
		super(name, day, month, year, empId, salary);
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerHours = chargesPerHours;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	@Override
	public double calSalary() {
		return salary + (extraHours * chargesPerHours);
	}
	
	public String getProjectTitle() {
		return projectTitle;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Project Title is  : "+projectTitle);
		System.out.println("Extra Hours : "+extraHours);
		System.out.println("Charges per extra hours : "+chargesPerHours);
	}

	@Override
	public String toString() {
		return super.toString() + "\nProject Title is  : "+projectTitle + "\nExtra Hours : "+extraHours
								+ "\nCharges per extra hours : "+chargesPerHours;
	}

	@Override
	public String getPassportDetails() {
		return passportDetails;
	}

	@Override
	public int getTravelHours() {
		return travelHours;
	}
	
	@Override
	public double calculateTA() {
		return (salary * TA / 100);
	}
}
