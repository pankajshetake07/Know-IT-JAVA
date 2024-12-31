package demos;

import entities.Student;

public class StudentDemo{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.display();
		
		int marks[] = {78,78,78,75,94};
		Student s2 = new Student(101, "Krishna", marks);
		s2.display();
		
		Student s3 = new Student(s2);
		s3.display();
	}
}