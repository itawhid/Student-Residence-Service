package ProjectExceptions;

public class NotImplementedException extends Exception{

	private String message="Not yet Implemented";

	public NotImplementedException() {


	}
	public NotImplementedException(String message) {
		this.message=message;

	}


	public String  getMessage() {

		return this.message;
	}



}
