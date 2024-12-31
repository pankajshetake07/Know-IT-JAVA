package app;

import java.util.Scanner;

import office.staff.Doctor;

public class DoctorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Day : ");
		int day = sc.nextInt();
		System.out.println("Enter Month : ");
		int month = sc.nextInt();
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Degree : ");
		String degree = sc.nextLine();
		System.out.println("Enter Reg No : ");
		int regNo = sc.nextInt();
		System.out.println("Enter Salary : ");
		double salary = sc.nextInt();
		Doctor d = new Doctor(name, day, month, year, degree, regNo, salary);
		
		System.out.println(d);
	}

}
