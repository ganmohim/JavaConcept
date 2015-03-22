package string.stringtokenizer;

import java.util.*;

public class StringTokenizerMultiDelimeters {
	public static void main(String[] args) {
		String url = "https://www.gmail.com/%20about.html";
		StringTokenizer tokenizer = new StringTokenizer(url, "/;-:.-%20_");
		
		System.out.println("Total tokens: " + tokenizer.countTokens());
		
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
