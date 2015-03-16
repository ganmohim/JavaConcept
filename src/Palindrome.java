public class Palindrome {


	public boolean isPalindrome(String word) {
	    boolean flag = true;
	    
	    char[] wordChar = new char[word.length()];
	    wordChar = word.toCharArray();
	    
	    int j = word.length() - 1;
	    
	    for (int i=0; i<wordChar.length; i++) {
	    	
	        if (wordChar[i] != wordChar[j]) {
	            return false;
	        }
	    
	        j--;
	    } // end of for
	    
	    return true;
     }
	
	public static void main(String[] args) {
	    String word = "madam";
	    
	    Palindrome p = new Palindrome();
	    
	    System.out.println(word + " is palindrome?" + p.isPalindrome(word));
	}
	
}

