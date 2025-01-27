package customException;

public class InvalidCountryException extends Exception{
	private String msg;
	
	public InvalidCountryException() {
		msg = "Invalid country exception";
	}

	//@Override
//	public String getMessage() {
//		return "User outside india cannot registered";
//	}

	@Override
	public String toString() {
		return "User outside india cannot registered";
	}
	
	
}
