/**
 * This class would parse mixed data.
 * 
 * 
 */

package scanner;

import java.util.*;
import java.io.*;

public class ParsingMixedData {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("scan-mixed-data.txt");
		Scanner sc = new Scanner(fr);
		
		FileWriter fw = new FileWriter("scn-mixed-data-output.txt");
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine(); // parse one line at a time
			Scanner scanLine = new Scanner(line); // second line as scanner
			
			// break each line for to seek out mixed data
			while (scanLine.hasNext()) {
				if (scanLine.hasNextInt())
					fw.write("integer: " + scanLine.nextInt() + " | ");
				else if (scanLine.hasNextDouble())
					fw.write("double: " + scanLine.nextDouble() + " | ");
				else if (scanLine.hasNextBoolean())
					fw.write("boolean: " + scanLine.nextBoolean() + " | ");
				else
					fw.write("string: " + scanLine.next() + " | ");
			} // end of inner while
			
			fw.write("\n");
			
		} // end of while
		
		
		
		
		fw.close();
		sc.close();
		
	} // end of main()
	
} // end of class
