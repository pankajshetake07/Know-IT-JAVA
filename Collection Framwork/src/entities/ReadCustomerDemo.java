package entities;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

import entities.Customer;
import entities.RegCustomer;

public class ReadCustomerDemo {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/KNOW-IT/MyData/customer.txt"));
		List<Customer> custList = new ArrayList<>();
		List<RegCustomer> regCustList = new ArrayList<>();
		
		while(true)
		{
			try
			{
				Object obj = ois.readObject();
				
				if(obj instanceof RegCustomer)
					regCustList.add((RegCustomer)obj);
				
				else if(obj instanceof Customer)
					custList.add((Customer)obj);
				
				
			}
			catch(Exception e)
			{
				break;
			}
		}
		
		for(Customer i:custList)
			System.out.println(i);
		
		for(RegCustomer j:regCustList)
			System.out.println(j);
		
		ois.close();

	}
}
