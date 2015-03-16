package datastructure.hashtable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Collections;


public class AddKeyValue {
	public static void main(String[] s) {
		Hashtable<String, String> table = new Hashtable();
		table.put("gan", "value1");
		table.put("ann", "value2");
		table.put("bob", "value3");
		
		Enumeration<String> e = table.keys();
		
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println(key + " : " + table.get(key));
		}
		
		System.out.println(table.keySet());
		
		Enumeration<String> val = table.elements();
		
		while (val.hasMoreElements()) {
			String value = val.nextElement();
			System.out.print(value + " ");
		}
		System.out.println();
		
		System.out.println("value4 exists? " + table.containsValue("value3"));
		System.out.println("key3 exists? "   + table.containsKey("key3"));
		System.out.println(table.get("key1"));
		
		List<String> list = new ArrayList<String>(table.keySet());
		Collections.sort(list);
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		for (String str : list) {
			System.out.println(str + ": " + table.get(str) );
			ht.put(str, table.get(str));
		}
		System.out.println(table);
		System.out.println(ht);
		
		
		
	}

}
