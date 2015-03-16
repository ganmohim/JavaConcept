package ch18;

import java.util.*;

public class RevFirstNameComparator implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		return bStr.compareToIgnoreCase(aStr);
	}

}
