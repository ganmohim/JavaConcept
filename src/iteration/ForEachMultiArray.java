package iteration;

public class ForEachMultiArray {
	public static void main(String[] args) {
		int[] [] a = new int[5] [5];
		int count = 0;
		
		for (int i=0; i < a.length; i++) {
			for (int j=0; j < a.length; j++) {
				a[i][j] = ++count; 
			}
		}
		
		for (int[] x : a) {
			for (int k: x) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
