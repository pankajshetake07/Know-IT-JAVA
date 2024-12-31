package entities;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;


import entities.Customer;
import entities.RegCustomer;

public class WriteCustomer {

	public static void main(String[] args) throws Exception{
		Customer [] cust = new Customer[5];
		ObjectOutputStream oos=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		oos=new ObjectOutputStream(new FileOutputStream("E:/KNOW-IT/MyData/customer.txt")); 

		int choice;
		for(int i=0; i<cust.length; i++) {
			System.out.println("\n\t1.Customer\n\t2.Reg Customer\n\t3.Exit");
			System.out.print("\n\tEnter your choice : ");
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			
				case 1: 
					cust[i] = new Customer();
					cust[i].accept();
					break;
					
				case 2:
					cust[i] = new RegCustomer();
					cust[i].accept();
					break;
				
				case 3:
					System.out.println("Exited....!");
					
				default:
					System.out.println("Enter correct choice!!!");
					break;
						
			}
			
		} 
		
		for(int i=0;i<cust.length;i++) {
			System.out.println("written");
			oos.writeObject(cust[i]);
		}
		System.out.println("Customer saved in file...");
		oos.close();
	}
}
