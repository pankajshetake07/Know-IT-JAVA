package customException;

public class CheckNameException extends Exception {
	private String msg;
	
	public CheckNameException() {
		msg = "name is not valid";
	}

	@Override
	public String getMessage() {
		return "First and Last letter should be capital";
	}

	@Override
	public String toString() {
		return msg;
	}
	
	
}
