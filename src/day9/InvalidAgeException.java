package day9;



public class InvalidAgeException extends RuntimeException {
	
	private static final long serialVersionUID=1L;
	InvalidAgeException(){
		super();
	}
	InvalidAgeException(String msg){
		super(msg);
	}
	public String toString() {
		return super.getMessage();
	}
	public String getMessage() {
		return super.getMessage();
	}
}
