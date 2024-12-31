package app;

import office.staff.MyNumber;

public class MyNumberDemo {

	public static void main(String[] args) {
		MyNumber m = new MyNumber();
		System.out.println("Factorial is : "+m.calFact(5));
		if(m.isPrime(9))
			System.out.println("Prime Number");
		else
			System.out.println("Not prime");
		
		if(m.isEven(9))
			System.out.println("Even number");
		else
			System.out.println("Not Even");
		
		if(m.isOdd(8))
			System.out.println("Number is odd");
		else
			System.out.println("Number is not odd");
	}

}
