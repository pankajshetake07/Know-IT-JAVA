package entities;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.CustomerLinkedSet;

public class CutomerLinkedHashSetDemo {

	public static void main(String[] args) {
	
		Set<CustomerLinkedSet> cust = new LinkedHashSet<CustomerLinkedSet>();
		cust.add(new CustomerLinkedSet("aaa",130));
		cust.add(new CustomerLinkedSet("bbb",10));
		cust.add(new CustomerLinkedSet("ccc",876));
		cust.add(new CustomerLinkedSet("ddd",543));
		cust.add(new CustomerLinkedSet("eeee",97));
		
		Set<CustomerLinkedSet> cust1 = new TreeSet<CustomerLinkedSet>();
		for(CustomerLinkedSet s : cust) {
			cust1.add(s);
		}
		
		for(CustomerLinkedSet c : cust1) {
			System.out.println(c);
		}

	}

}
