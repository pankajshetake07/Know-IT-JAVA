package entities;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import entities.Employee;

public class EmpDemp1 {

	public static void main(String[] args) {
		Comparator<Employee> compare = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = o1.getDepartment().compareTo(o2.getDepartment());
				if(diff == 0) {
					if(o1.getSalary() > o2.getSalary()) {
						diff = 1;
					} else if(o1.getSalary() < o2.getSalary()) {
						diff = -1;
					} else {
						diff = o1.getEmpName().compareTo(o2.getEmpName());
						if(diff == 0) {
							diff = o1.getEmpId() - o2.getEmpId();
						}
					}
				}
				
				return diff;
			}
			
		};
		Set<Employee> emp = new TreeSet<>(compare);
		
		emp.add(new Employee(101, "krishn", 20000, "ABC"));
		emp.add(new Employee(105, "karn", 15000, "MNC"));
		emp.add(new Employee(109, "arjun", 17000, "PQR"));
		emp.add(new Employee(102, "bheem", 16000, "XYZ"));
		emp.add(new Employee(104, "pankaj", 25000, "HGI"));
		emp.add(new Employee(103, "pankaj", 25000, "HGI"));
		emp.add(new Employee(111, "pankaj", 25000, "HGI"));
		
		System.out.println(emp);

	}

}
