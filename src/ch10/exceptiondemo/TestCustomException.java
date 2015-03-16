package ch10.exceptiondemo;

public class TestCustomException {
	public static void age(int age) throws InvalidAgeException {
		if (age < 13)
			throw new InvalidAgeException("Age is invalid");
	}
	
	public static void main(String[] args) {
		try {
			age(5);
		} catch (InvalidAgeException e) {
			System.out.println("Exception Caught: " + e);
		}
	}

}
