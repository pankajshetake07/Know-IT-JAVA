package entities;
import java.util.HashSet;
import java.util.Set;

import entities.Student;

public class StudentDemo {
 
	public static void main(String[] args) {
		
		Set<Student> student = new HashSet<>();
		student.add(new Student(1,"krishn", "kolhapur", 89.87));
		student.add(new Student(9,"arjun", "pune", 78.9));
		student.add(new Student(2,"karn", "kolhapur", 96.89));
		student.add(new Student(5,"bheem", "kolhapur", 75));
		student.add(new Student(3,"ram", "mumbai", 86.8));
		student.add(new Student(4,"pankaj", "kolhapur", 88.87));
		student.add(new Student(8,"rohit", "mumbai", 70.9));
		student.add(new Student(7,"virat", "chennai", 91.9));
		student.add(new Student(6,"dhoni", "kolhapur", 79.87));
		student.add(new Student(11,"raina", "pune", 82.8));
		System.out.println(student);

	}

}
