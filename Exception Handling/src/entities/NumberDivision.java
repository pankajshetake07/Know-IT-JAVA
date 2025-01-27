package entities;

public class NumberDivision {

	public static void main(String[] args) {
		try {
			
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.println("Division is : "+n1/n2);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
