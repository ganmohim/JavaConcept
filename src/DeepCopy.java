import java.util.Arrays;


public class DeepCopy {
	private int a[];
	
	public DeepCopy(int[] array) {
		a = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			a[i] = array[i];
		}
		
	}
	
	public void showData() {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] array = {7, 10, 1, 3, 6};
		DeepCopy dc = new DeepCopy(array);
		dc.showData();
		array[1] = 9;
		dc.showData();
	}

}
