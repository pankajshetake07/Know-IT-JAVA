package entities;

import customException.PasswordTooLongException;
import customException.PasswordTooShortException;

public class Password {
	private String pass;
	
	public Password() {
		pass = "ajsdff";
	}
	
	public Password(String pass) {
		try {
			
			if(pass.length() > 12) {
				throw new PasswordTooLongException();
			} 
			else {
				this.pass = pass;
			}
			
		} catch (PasswordTooLongException p) {
			p.printStackTrace();
		}
		
		try {
			if(pass.length() < 8) {
				throw new PasswordTooShortException();
			}
			else {
				this.pass = pass;
			}
		} catch (PasswordTooShortException p) {
			p.printStackTrace();;
		}
	}
	
	public void display() {
		try {
			if(pass.length() >= 8 && pass.length() <= 12) {
				System.out.println("password : "+pass);
				throw new PasswordTooLongException();
			}
		}
		catch(PasswordTooLongException p) {
			p.getMessage();
		}
	}
	
}
