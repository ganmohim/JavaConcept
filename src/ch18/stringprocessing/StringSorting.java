package ch18.stringprocessing;

public class StringSorting {
	public static void main(String[] args) {
		String[] strArray = {"dan", "ann", "linda", "ann"};
		
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				if (strArray[i].compareToIgnoreCase(strArray[j]) > 0) {
					String temp = strArray[j];
					strArray[j] = strArray[i];
					strArray[i] = temp;
				}
			} // end of inner for
		} // end of outer for
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}

}
