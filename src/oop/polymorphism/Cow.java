package oop.polymorphism;

public class Cow extends Animal {
	public Cow(String name) {
		super(name);
	}
	
	public void play() {
		System.out.println("Cow playing...");
	}

}
