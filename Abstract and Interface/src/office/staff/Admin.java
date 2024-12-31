package office.staff;

public class Admin extends Employee {
	private double bonus;

	public Admin() {
		super();
		bonus = 0.0;
	}

	public Admin(String name, int day, int month, int year, int empId, double salary, double bonus) {
		super(name, day, month, year, empId, salary);
		this.bonus = bonus;
	}
	
	@Override
	public double calSalary() {
		return salary + bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Bonus : "+bonus);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nBonus : "+bonus;
	}
	
	
}
