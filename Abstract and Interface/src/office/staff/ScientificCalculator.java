package office.staff;

import office.utility.iScientificCalculator;

public class ScientificCalculator implements iScientificCalculator {

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

	public double sin(double angle) {
		return Math.sin(angle);
	}
	
	public double cos(double angle) {
		return Math.cos(angle);
	}

	public double tan(double angle) {
		return Math.tan(angle);
	}

}
