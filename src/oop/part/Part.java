package oop.part;

public class Part {
	private static int NumParts = 0;
	private String name;
	private double price;
	
	public Part(String n, double p) {
		name = n;
		price = p;
		NumParts++;
	}
	
	public static int GetNumParts() {
		return NumParts;
	}
	
	public String toString() {
		return "Name of Part: " + name + "\n" + "Price: " + price + "\n";
	}


}
