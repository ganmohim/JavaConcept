package ch10.exceptiondemo;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
