package ch18;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("D");
		
//		Iterator<String> iterator = al.iterator();
//		
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next() + " ");
//		}
		
		ListIterator<String> listIterator = al.listIterator();
		
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		
		System.out.println();
		
		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.print(str + " ");
			
		}

	}
	
	

}
