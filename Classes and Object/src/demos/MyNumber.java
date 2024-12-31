package demos;
public class MyNumber{
	private int number;
	
	MyNumber(){
		number = 0;
	}
	
	MyNumber(int number){
		this.number = number;
	}
	
	void isNegative(){
		if(number < 0){
			System.out.println("Number is Negative");
		}
	}
	
	void isPositive(){
		if(number > 0){
			System.out.println("Number is Positive");
		}
	}
	
	void isEven(){
		if(number % 2 == 0){
			System.out.println("Number is Even");
		}
	}
	
	void isOdd(){
		if(number % 2 != 0){
			System.out.println("Number is Odd");
		}
	}
	
	public static void main(String a[]){
		MyNumber m = new MyNumber(4);
		m.isEven();
		m.isPositive();
		m.isNegative();
		m.isOdd();
	}
}