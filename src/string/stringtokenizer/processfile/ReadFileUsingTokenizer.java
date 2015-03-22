package string.stringtokenizer.processfile;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingTokenizer {
	public static void main(String[] args) throws IOException {
		String line;
		BufferedReader br = new BufferedReader(
				new FileReader("string-tokenizer-file-processor.txt"));
		
		while ( (line = br.readLine()) != null  ) {
			StringTokenizer tokenizer = new StringTokenizer(line, ", ");
			
			while (tokenizer.hasMoreTokens()) {
				// user name
				String userName = tokenizer.nextToken().toString();
				
				// page id user visited
				Integer pageId = Integer.parseInt(
						tokenizer.nextToken().toString());
				
				// Number of visit
				Integer numberOfVisit = Integer.parseInt(
						tokenizer.nextToken().toString());
				
				// Last time visited
				String lastTimeStamp = tokenizer.nextToken().toString();
				
				StringBuilder sb = new StringBuilder();
				sb.append("\n User Name: " + userName);
				sb.append("\n Page ID: " + pageId);
				sb.append("\n Number of Visit: " + numberOfVisit);
				sb.append("\n Last time stamp of visit: " + lastTimeStamp);
				sb.append("\n *************************** \n");
				
				System.out.println(sb.toString());
				
			} // end of while for tokenizer
			
		} // end of while
		
		
	} // end of main()

} // end of class ReadFileUsingTokenizer
