package iteration;

public class ForEachWithBreak {
	public static void main(String[] args) {
		int[] i = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		
		for (int x : i) {
			sum += x;
			
			if (x == 5)
				break;
		}
		System.out.println("Sum is: " + sum);
	}

}
