package app;

import office.staff.ScientificCalculator;
import office.utility.iScientificCalculator;

public class ScientificCalculatorDemo {

	public static void main(String[] args) {
		iScientificCalculator s = new ScientificCalculator();
		System.out.println("Additon is : "+s.add(10, 10));
		System.out.println("Subtraction is : "+s.sub(21, 34));
		System.out.println("Multiplication is : "+s.mul(3, 5));
		System.out.println("Division is : "+s.div(45, 7));
		System.out.println("Sin angle is : "+s.sin(45));
		System.out.println("Cos angle is : "+s.cos(90));
		System.out.println("Tan angle is : "+s.tan(60));

	}

}
