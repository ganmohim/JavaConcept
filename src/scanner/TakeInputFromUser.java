package scanner;

import java.util.*;

public class TakeInputFromUser {
	public static void main(String[] args) {
		int count = 0; double sum = 0.0;
		System.out.println("Please enter grades... Type done to finish");
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				count++;
			}
			
			else if (sc.next().equals("done"))
				System.out.println("Avg grade is: " + sum/count);
			
			else
				System.out.println("Invalid entry");
		}
		
	}
	

}
