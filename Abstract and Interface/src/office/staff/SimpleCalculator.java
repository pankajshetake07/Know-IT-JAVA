package office.staff;

import office.utility.iCalculator;

public class SimpleCalculator implements iCalculator {

	@Override
	public double add(int a, int b) {
		return a+b;
	}

	@Override
	public double sub(int a, int b) {
		if(a > b)
			return a-b;
		else
			return b-a;
	}

	@Override
	public double mul(int a, int b) {
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		return a/b;
	}

}
