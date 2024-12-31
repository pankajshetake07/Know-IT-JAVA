package app;

import office.staff.SimpleCalculator;

public class SimpleCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator s = new SimpleCalculator();
		System.out.println("Additon is : "+s.add(10, 10));
		System.out.println("Subtraction is : "+s.sub(21, 34));
		System.out.println("Multiplication is : "+s.mul(3, 5));
		System.out.println("Division is : "+s.div(45, 7));
	}

}
