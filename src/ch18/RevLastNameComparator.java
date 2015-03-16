package ch18;

import java.util.*;

public class RevLastNameComparator implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		int i, j;
		
		i = aStr.lastIndexOf(" ");
		j = bStr.lastIndexOf(" ");
		
		return bStr.substring(j).compareToIgnoreCase(aStr.substring(i));
	}

}
