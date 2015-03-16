package datastructure.hashmap;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(3, "pen");
		hm.put(1, "watch");
		hm.put(5, "paper");
		hm.put(4, "monitor");
		hm.put(2, "keyboard");
		
		// Find all the values
		Collection<String> productVal = hm.values();
		Iterator<String> it = productVal.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<Integer> list = new ArrayList<Integer> (hm.keySet());
		Collections.sort(list);
		
		LinkedHashMap<Integer, String> linkeHashMap = new LinkedHashMap<Integer, String>();
		
		for (Integer i : list) {
			linkeHashMap.put(i, hm.get(i));
		}
		
		System.out.println(linkeHashMap);
		
		System.out.println(linkeHashMap.containsValue("pen"));
		
	} // end of main
	

} // end of HashMap
