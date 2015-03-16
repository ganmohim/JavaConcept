package iteration;

import java.io.IOException;

public class DoWhile {
	public static void main(String[] args) throws IOException {
		char c;
		do {
			System.out.println("Menu..");
			System.out.println("1. Cook");
			System.out.println("2. Defroast");
			System.out.println("3. Roast");
			System.out.println("4. Quick Heat");
			
			System.out.println("Enter your choice: ");
			c = (char) System.in.read();
		} while (c < '1' || c > '4');
		
		switch (c) {
		case '1':
			System.out.println("Cooking started...");
			break;
		
		case '2':
			System.out.println("Defroasting now");
			break;
		default:
			System.out.println("Option is unknwown. Going back to main "
					+ "menu...");
		}
	}

}
