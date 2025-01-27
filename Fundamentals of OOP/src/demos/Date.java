package demos;
public class Date{
	private int day;
	private int month;
	private int year;
	Date(){
		day = month = 1;
		year = 2002;
	}
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void setDay(int day){
		this.day = day;
	}
	int getDay(){
		return day;
	}
	
	void setMonth(int month){
		this.month = month;
	}
	int getMonth(){
		return month;
	}
	
	void setYear(int year){
		this.year = year;
	}
	int getYear(){
		return year;
	}
	
	void display(){
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main(String a[]){
		Date d1 = new Date();
		System.out.println(d1.getYear());
		d1.display();
		Date d2 = new Date(3,4,2002);
		System.out.println(d2.getDay());
		d2.display();
		Date d3 = new Date();
		d3.setDay(7);
		d3.setMonth(7);
		d3.setYear(2013);
		System.out.println(d3.getMonth());
		d3.display();
	}
}