package demos;

import entities.PrimeNumber;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber(1,100);
		p.getThread().start();
	}

}
