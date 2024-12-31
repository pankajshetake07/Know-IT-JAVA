package office.utility;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date() {
		day = month = 1;
		year = 2022;
	}


	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void display() {
		System.out.println("Date of birth : "+day+"/"+month+"/"+year);
	}
	
	public String toString() {
		return "Date of birth : "+day+"/"+month+"/"+year;
	}
	
	
}
