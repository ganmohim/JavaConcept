package ch19.scanner.file;

import java.util.Scanner;
import java.io.*;

public class AvgNumbersFile {
	public static void main(String[] args) throws IOException {
		double sum = 0.0;
		int count = 0;
		
		FileWriter fw = new FileWriter("test.txt");
		fw.write("1 5 10.5 3.5 10 done");
		fw.close();
		
		FileReader fr = new FileReader("test.txt");
		Scanner sc = new Scanner(fr);
		
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				count++;
			}
			else {
				if (sc.next().equals("done")) {
					break;
				}
			}
		}
		
		sc.close();
		System.out.println("Average is: " + sum/count);
		
	}

}
