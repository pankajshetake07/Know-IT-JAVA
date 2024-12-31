package entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	private int rollno;
	private String name;
	private int[] marks;
	int subjects;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void accept() {
		try {
			System.out.println("Enter student roll number : ");
			rollno = Integer.parseInt(br.readLine());
			System.out.println("Enter student name : ");
			name = br.readLine();
			System.out.println("Enter number of subjects : ");
			subjects = Integer.parseInt(br.readLine());
			marks = new int[subjects];
			System.out.println("Enter "+ subjects + " subject marks : ");
			for(int i=0; i<subjects; i++) {
				marks[i] = Integer.parseInt(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		System.out.print("\nRoll number : "+rollno);
		System.out.print("\nName : "+name);
		System.out.print("\nPercentage : ");
		int sum = 0;
		for(int i=0; i<subjects; i++) {
			sum += marks[i];
		}
		System.out.println((double)(sum/marks.length));
	}
}
