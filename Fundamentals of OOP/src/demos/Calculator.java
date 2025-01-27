package demos;
public class Calculator{
	private int no1;
	private int no2;
	
	Calculator(){
		no1 = no2 = 1;
	}
	
	Calculator(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
	}
	
	int addition(){
		return no1 + no2;
	}
	
	int subtraction(){
		return no1 - no2;
	}
	
	int multiplication(){
		return no1 * no2;
	}
	
	float division(){
		return (float)no1 / no2;
	}
	
	public static void main(String a[]){
		Calculator c1 = new Calculator();
		System.out.println(c1.addition());
		System.out.println(c1.division());
		
		Calculator c2 = new Calculator(6,4);
		System.out.println("Addition is : "+c2.addition());
		System.out.println("Division is : "+c2.division());
		System.out.println("Subtraction is : "+c2.subtraction());
		System.out.println("Multiplication is : "+c2.multiplication());
	}
}