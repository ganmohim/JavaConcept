package ch18.stringprocessing;

public class StringProcessingDemo {
	public static void main(String[] args) {
		String str = "this is me";
		
		String otherStr = str.replace(" ", "%");
		System.out.println("Replace: " + str + " ==> " + otherStr);
		
		String subString = str.substring(2);
		System.out.println("Substring from index 2: " + str + " ==> " + subString);
		
		System.out.println(str.contains("gan"));
		
		String replacedStr = str.replace("i", "t");
		System.out.println("Replace: " + str + " ==> " + replacedStr);
		
		String url        = "www.amazon%20.com";
		String revisedUrl = url.replace(".a", " ");
		System.out.println(revisedUrl);
		
		System.out.println("Last output: " + str.substring(10));
		
	}

}
