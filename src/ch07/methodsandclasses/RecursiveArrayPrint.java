/**
 * Purpose: This program shows how to reverse print the content of an array using
 * recursion.
 * 
 * Description: The follow tree shows how recursive printing of an array works.
 * 
 * 
 * Reverse recursion starts with fist index < < <
 * 
 * i=0
 * print(i++)---
 *             |
 *             |
 *             i=1
 *             print(i++)---
 *                          |
 *                          |
 *                          i=2
 *                          print(i++)---    <-- 
 *                                      |       |
 *                                      |       | 
 *                                      i = 3 ---
 *   
 * Forward recursion starts with last index (a.length - 1) > > >
 * 
 * i=2
 * print(i--)---
 *             |
 *             |
 *             i=1
 *             print(i--)---
 *                          |
 *                          |
 *                          i=0
 *                          print(i--)---    <-- 
 *                                      |       |
 *                                      |       | 
 *                                      i = 3 ---
 *                                         
 *

 */ 

package ch07.methodsandclasses;

public class RecursiveArrayPrint {
	int a[];
	
	public RecursiveArrayPrint(int size) {
		a = new int[size];
		
		for (int i = 0; i < size; i++) {
			a[i] = i;
		}
	}
	
	public void printArrayUsingRecursion(int j) {
		/*
		if (j == 0) return;
		else printArrayUsingRecursion(j-1);
		*/
		
		if (j == a.length) return;
		else printArrayUsingRecursion(j+1);
		
		//System.out.println("a[" + (j-1) + "]" + " = " + a[j-1]);
		System.out.println("a[" + j + "]" + " = " + a[j]);
	}
	
	public static void main(String[] args) {
		RecursiveArrayPrint obj = new RecursiveArrayPrint(3);
		// obj.printArrayUsingRecursion(obj.a.length); // uncomment for forward
		obj.printArrayUsingRecursion(0);
		
	}

}
