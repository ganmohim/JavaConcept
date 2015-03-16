package scanner;

import java.util.*;

public class AvgNums {
	public static void main(String[] args) {
		double sum = 0.0;
		double average = 0.0;
		double numberOfGrade = 0;
		
		System.out.println("Enter each grade separated by newline: ");
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			if (scanner.hasNextDouble()) {
				sum += scanner.nextDouble();
				numberOfGrade++;
				
			} // end of if
			
			else {
				if (scanner.next().equals("done")) {
					average = sum / numberOfGrade;
					System.out.println("Average: " + average);
					break;
				} // end of if
				
				else {
					System.out.println("Output Error!");
				} // end of else
			} // end of else
		} // end of while
		
	} // end of main()

} // end of AvgNum
