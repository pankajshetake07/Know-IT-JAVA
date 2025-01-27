package office.utility;

public class Person {
	private String name;
	
	Date dob;
	
	public Person(){
		name = "NA";
		this.dob = new Date();
	}
	
	public Person(String name, int day, int month, int year){
		this.name = name;
		this.dob = new Date(day, month, year);
	}
	
	public void display() {
		System.out.println("Name : "+name);
		dob.display();
	}
}
