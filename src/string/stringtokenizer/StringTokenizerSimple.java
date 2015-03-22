package string.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerSimple {
	public static void main(String[] args) {
		String str = "This is time for all brave men to face their fears";
		StringTokenizer defaultTokenizer = new StringTokenizer(str);
		
		System.out.println("Total number of token: " + defaultTokenizer.countTokens());
		
		while (defaultTokenizer.hasMoreTokens()) {
			System.out.println(defaultTokenizer.nextToken());
		}
	}

}
