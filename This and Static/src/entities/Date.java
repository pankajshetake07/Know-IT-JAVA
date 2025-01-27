package entities;
public class Date{
	private int day;
	private int month;
	private int year;
	static int count = 0;
	
	Date(){
		++count;
		day = month = 1;
		year = 2020;
	}
	
	Date(int day, int month, int year){
		++count;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void display(){
		System.out.println(day+"/"+month+"/"+year);
	}
	
//	int objectCount(){
//		return count;
//	}
	
	public static void main(String a[]){
		Date d = new Date();
		d.display();
		Date d1 = new Date(1,1,1111);
		d1.display();
		Date d2 = new Date(2,2,2222);
		d2.display();
		Date d3 = new Date(3,3,3333);
		d3.display();
		System.out.println("Count of object is  : "+count);
	}
}