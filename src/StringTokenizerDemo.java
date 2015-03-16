import java.util.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "Today is Friday";
		String strArray[] = new String[3];
		String strOut;
		int i = 0;
		StringTokenizer strToken = new StringTokenizer(str);
		
		while (strToken.hasMoreTokens()) {
			//strOut= strToken.nextToken();
			//System.out.println(strOut);
			strArray[i++] = strToken.nextToken();
		} // end of while
		
		for (int j = strArray.length-1; j >= 0 ; j--) {
			System.out.print(strArray[j]);
			System.out.print(" ");
		}
		
		
	} // end of main
} // end of StringTokenizerDemo
