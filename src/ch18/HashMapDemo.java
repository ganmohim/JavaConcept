package ch18;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("John Doe", 2323.23);
		hm.put("Brad McDonald", 3131.31);
		hm.put("Cam Gordon", 4243.42);
		hm.put("Gan Mohim", 5232.44);
		
		Set <Map.Entry<String, Double>> st = hm.entrySet();
		
		for (Map.Entry<String, Double> s : st) {
			System.out.print(s.getKey() + ":");
			System.out.println(s.getValue());
		}
			
	}

}
