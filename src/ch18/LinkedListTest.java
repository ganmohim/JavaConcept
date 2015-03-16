package ch18;

import java.util.*;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("gan");
		linkedList.add("ann");
		linkedList.add("bob");
		
		
		System.out.println(linkedList);
		linkedList.push("mac");
		System.out.println(linkedList);
		linkedList.push("ron");

		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		System.out.println(linkedList);
		linkedList.add("luk");
		System.out.println(linkedList);
		
		while (linkedList.peek() != null) {
			System.out.println(linkedList.pollLast());
		}
	}
}
