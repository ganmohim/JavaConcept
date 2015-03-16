package scanner;

import java.util.*;
import java.io.*;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		double sum  = 0;
		int counter = 0;
		
		FileWriter fw = new FileWriter("input.txt");
		fw.write("1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0 done");
		fw.close();
		
		FileReader fr = new FileReader("input.txt");
		Scanner sc = new Scanner(fr);
		
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				counter++;
 	 		}
			
			else if (sc.next().equals("done")) {
				break;
			}
		} // end of while
		sc.close();
		System.out.println("Average is: " + sum / counter);
		
	}

}
