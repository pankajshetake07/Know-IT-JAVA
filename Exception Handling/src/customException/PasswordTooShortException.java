package customException;

public class PasswordTooShortException extends Exception{
	private String msg;
	
	public PasswordTooShortException() {
		msg = "Password too short";
	}
	
	@Override
	public String getMessage() {
		return "Password should be minimum 8 characters long";
	}

	@Override
	public String toString() {
		return "Password should be minimum 8 characters long";
	}
}
