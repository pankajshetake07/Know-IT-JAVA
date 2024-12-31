package entities;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import entities.RegCustomer;

public class CustomerRegCustomerDemo {

	public static void main(String[] args) throws Exception{
		
		RegCustomer[] r = new RegCustomer[5];
		ObjectOutputStream oos = null;
		oos = new ObjectOutputStream(new FileOutputStream("E:/KNOW-IT/MyData/cutom.txt"));
		for(int i=0; i<r.length; i++) {
			r[i] = new RegCustomer();
			r[i].accept();
			
		}
		
		for(int i=0; i<r.length; i++) {
			oos.writeObject(r[i]);
		}
		System.out.println("Data written successfully");
		oos.close();
	}

}
