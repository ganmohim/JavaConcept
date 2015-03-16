package string;

public class StringBufferTest {
	public static void main(String[] args) {
		String str = "one string data";
		char c = str.charAt(1);
		
		System.out.println(str + "\n");
		System.out.println("char at 1: " + c);
		
		StringBuffer strBuff = new StringBuffer(str);
		
		System.out.println("Position 0 is replaced with 1");
		strBuff.setCharAt(0, '1');
		System.out.println(strBuff);
		
		char[] charBuffer = new char[6];
		strBuff.getChars(4, 10, charBuffer, 0);
		
		System.out.println("Content of chaBuffer: " + new String(charBuffer));
		
		String url        = "www.bbc.com";
		String updatedUrl = url.replaceAll("[,\\.]+", "+");
		System.out.println(updatedUrl);
		
		
		
		
	} // end of main()

} // end of stringBufferTest
