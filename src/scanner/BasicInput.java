package scanner;

import java.util.Scanner;

public class BasicInput {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.println("Enter your name: ");
		name = scanner.next();
		System.out.println("Your name is: " + name);
		
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		System.out.println("Your age is: " + age);
	}

}
