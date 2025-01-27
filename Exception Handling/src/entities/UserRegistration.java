package entities;

import customException.InvalidCountryException;

public class UserRegistration {
	private String userName;
	private String userCountry;
	
	public UserRegistration() {
		userName = "NA";
		userCountry = "NA";
	}
	
	public UserRegistration(String userName, String userCountry) {
		this.userName = userName;
		try {
			if(!userCountry.equals("India")) {
				throw new InvalidCountryException();
			} 
			else {
				this.userCountry = userCountry;
			}
		} catch (InvalidCountryException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public void display() {
		try {
			if(!userCountry.equals("India")) {
				throw new InvalidCountryException();
			} else {
				System.out.println("User registration done successfuly");
			}
		} catch (InvalidCountryException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}
	
	
}
