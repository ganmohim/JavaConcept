package datastructure.hashtable;

import java.util.*;

public class HashtableValues {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("3", "three");
		ht.put("100", "thundred");
		ht.put("12", "tweleve");
		
		Enumeration<String> e = ht.keys();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();
		
		Enumeration<String> en = ht.elements();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();
		
		// Sort the content of hashtable
		List<String> listOfKeys = new ArrayList<String>(ht.keySet());
		Collections.sort(listOfKeys);
		
		for (String key : listOfKeys) {
			System.out.println(key + " : " + ht.get(key));
		}
		
		
	}
	

}
