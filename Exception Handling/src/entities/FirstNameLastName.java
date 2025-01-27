package entities;

import java.util.Scanner;

import customException.CheckNameException;

public class FirstNameLastName {
	
	public static boolean checkFirstName(String firstName) {
		if(firstName.charAt(0) > 'A' && firstName.charAt(0) < 'Z') {
			return true;
		}
		return false;
	}
	
	public static boolean checkLastName(String lastName) {
		if(lastName.charAt(0) > 'A' && lastName.charAt(0) < 'Z') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String fistName = sc.nextLine();
		System.out.println("Enter last name : ");
		String lastName = sc.nextLine();
		try {
			if(checkFirstName(fistName) && checkLastName(lastName)) {
				System.out.println("Welcome "+fistName+" "+lastName);
			} else {
				throw new CheckNameException();
			}
		} 
		catch (CheckNameException c) {
			System.out.println(c.getMessage());
		}
	}
}
