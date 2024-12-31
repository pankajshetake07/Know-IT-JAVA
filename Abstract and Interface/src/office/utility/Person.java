package office.utility;

public class Person {
	String name;
	Date dob;
	public Person() {
		name = "ABC";
		this.dob = new Date();
	}
	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.dob = new Date(day, month, year);
	}
	
	public void display() {
		System.out.println("Person Name : "+name);
		dob.display();
	}
	
	public String toString() {
		return "Person Name : "+ name + "\n" +dob.toString();
	}
}
