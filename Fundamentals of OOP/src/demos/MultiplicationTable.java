package demos;
public class MultiplicationTable{
	public static void main(String args[]){
		//Horizontal
		for(int i=2; i<=12; i++){
			System.out.print(i+": ");
			for(int j=1; j<= 10; j++){
				System.out.print(i*j+"  ");
			}
			//System.out.println();
		}
		
		//Vertical
		System.out.println("--------------------------------------");
		for(int i=2; i<=12; i++){
			for(int j=1; j<=10; j++){
				System.out.println(i*j);
			}
			System.out.println();
		}
	}
}