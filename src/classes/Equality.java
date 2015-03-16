package classes;

public class Equality {
	int a;
	int b;
	
	public Equality(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean equalTo(Equality passedObject) {
		if ( (passedObject.a == this.a) && (passedObject.b == this.b))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Equality obj1 = new Equality(100, 100);
		Equality obj2 = new Equality(100, 100);
		Equality obj3 = new Equality(200, 200);
		
		System.out.println("obj1 == obj2 ? " + obj1.equalTo(obj2));
		System.out.println("obj1 == obj3 ? " + obj1.equalTo(obj3));
		
	}

}
