package entities;

public class Demo {
	
	Demo(int a) {
		
		System.out.println("this is demo 1");
	}
	
	Demo() {
		this(10);
		System.out.println("this is demo 2");
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		
	}

}
