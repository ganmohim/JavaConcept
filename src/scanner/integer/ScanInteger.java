package scanner.integer;

import java.util.*;

public class ScanInteger {
	public static void main(String[] args) {
		System.out.println("Enter list of integer: ");
		Scanner sc = new Scanner(System.in);
		int i;
		
		while (sc.hasNextInt()) {
			i = sc.nextInt();
			System.out.println("You have typed: " + i);
		}

	} // end of main

}
