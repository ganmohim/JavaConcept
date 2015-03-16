package ch18.stringprocessing;

import java.util.*;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello this is me");
		System.out.println("buffer before = " + sb);
		System.out.println("chatAt(1) before = "  + sb.charAt(1));
		
		sb.setCharAt(1, 'i');
		//sb.setLength(2);
		System.out.println("buffer after = " + sb);
		System.out.println("charAt(1) after = " + sb.charAt(1));
		
		char[] c = new char[4];
		sb.getChars(1, 5, c, 0);
		System.out.println(c);
		
		StringBuffer sb2 = new StringBuffer("Hello Mom!");
		sb2.setCharAt(1, 'i');
		System.out.println(sb2);
		sb2.append(" I am here");
		System.out.println(sb2);
		char ca[] = new char[5];
		sb2.getChars(0, 5, ca, 0);
		System.out.println(ca);
	}

}
