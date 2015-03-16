package oop.part;

public class TestPart {
	public static void main(String[] args) {
		Part p = new Part("Air Filter", 8.75);
		//Part c = new Part("Door Lock",  17.39);
		
		System.out.println("Number of Part object: " + Part.GetNumParts());
		System.out.printf("%s", p);
		
	}

}

