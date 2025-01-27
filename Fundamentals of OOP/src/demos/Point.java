package demos;
public class Point{
	private int x_cordinate;
	private int y_cordinate;
	
	Point(){
		x_cordinate = 2;
		y_cordinate = 4;
	}
	
	Point(int x, int y){
		x_cordinate = x;
		y_cordinate = y;
	}
	
	void display(){
		System.out.println("["+x_cordinate+","+y_cordinate+"]");
	}
	
	public static void main(String a[]){
		Point p = new Point();
		p.display();
		
		Point p1 = new Point(55,11);
		p1.display();
	}
}