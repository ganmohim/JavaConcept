package ch18;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		Integer[] ia = new Integer[al.size()];
		ia = al.toArray(ia);
		int sum = 0;
		
		for (int i : ia) {
			sum += i;
		}
		
		System.out.println("Total is: " + sum);
	}

}
