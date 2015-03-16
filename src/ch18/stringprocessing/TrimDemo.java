package ch18.stringprocessing;

import java.util.*;

public class TrimDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("Enter the name of the country");
			input = sc.next();
			
			if (input.equals("US"))
				System.out.println("Washington DC");
			else if (input.equals("Canada"))
				System.out.println("Ottawa");
			
		} while (! input.equals("stop"));
		
		System.out.println("Terminated!");
	}

}