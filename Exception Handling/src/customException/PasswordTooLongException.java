package customException;

public class PasswordTooLongException extends Exception{
	private String msg;
	
	public PasswordTooLongException() {
		msg = "Password too long";
	}

	@Override
	public String getMessage() {
		return "Password must be upto 12 characters long";
	}

	@Override
	public String toString() {
		return "Password must be 12 upto characters long";
	}
	
}
