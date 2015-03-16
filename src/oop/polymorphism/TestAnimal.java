package oop.polymorphism;

public class TestAnimal {
	public static void main(String[] args) {
		Animal[] arrayOfAnimal = new Animal[2];
		
		Animal cow  = new Cow("cow");
		arrayOfAnimal[0] = cow;
		
		Animal lamb = new Lamb("lamb");
		arrayOfAnimal[1] = lamb;
		
		for (int i = 0; i < arrayOfAnimal.length; i++) {
			arrayOfAnimal[i].play();
		}
	}

}
