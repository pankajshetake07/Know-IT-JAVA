package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Employee implements ITraveller{
	private int salesTarget;
	private double incentive;
	private String passportDetails;
	private int travelHours;
	public SalesManager() {
		super();
		salesTarget = 0;
		incentive = 0.0;
		passportDetails = "mnc";
		travelHours = 1;
	}
	public SalesManager(String name, int day, int month, int year, int empId, double salary, int salesTarget,
			double incentive,String passportDetails, int travelHours) {
		super(name, day, month, year, empId, salary);
		this.salesTarget = salesTarget;
		this.incentive = incentive;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}
	
	public int getSalesTarget() {
		return salesTarget;
	}
	
	@Override
	public double calSalary() {
		return salary + (salesTarget * incentive / 100);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Sales Target : "+salesTarget);
		System.out.println("Incentive : "+incentive);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSales Target : " + salesTarget + "\nIncentive : "+incentive;
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
