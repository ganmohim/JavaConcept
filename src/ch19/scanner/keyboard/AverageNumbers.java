package ch19.scanner.keyboard;

import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args) {
		int sum, count;
		sum = count = 0;
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter scores: ");
		
		while (conin.hasNext()) {
			if (conin.hasNextDouble()) {
				sum += conin.nextDouble();
				count++;
			}
			
			else {
				if (conin.next().equals("done") )
					break;
			}
		}
		
		System.out.println("Avergate is: " + sum/count);
	}

}
