package office.staff;
import office.utility.AdvtIntOperations;
import office.utility.BasicIntOperations;

public class MyNumber implements BasicIntOperations, AdvtIntOperations {

	@Override
	public boolean isPrime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public double calFact(int num) {
		int fact = 1;
		if(num < 0) {
			return -1;
		}
		if(num == 1 && num == 0) {
			return 1;
		}
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}

	@Override
	public boolean isOdd(int num) {
		if(num % 2 != 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}

	
}
