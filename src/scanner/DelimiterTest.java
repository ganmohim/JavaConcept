package scanner;

import java.util.*;

public class DelimiterTest {
	public static void main(String[] args) {
		
		 // Read integers only
		 System.out.println("Scanned integers only...");
	  	 String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input);
	     s.useDelimiter("[^0-9]+");
	     
	     while (s.hasNext()) {
	    	 
	    	 System.out.println(s.next());
	     }
	     s.close();
	     
	     // Read string only
		 System.out.println("\nScanned strings only...");
	  	 String txtLine = "1,    fish, 2, fish, red, fish, blue, fish";
	     Scanner sc = new Scanner(txtLine);
	    // Anything that is not a letter (1 or more of them) can be used a delimiter
	     //sc.useDelimiter("[^a-zA-Z]+"); 
	     sc.useDelimiter(", *");
	     
	     while (sc.hasNext()) {
	    	 
	    	 System.out.println(sc.next());
	     }
	     sc.close();
	}

}
