import java.util.Arrays;


public class ShallowCopy {
	private int[] a;
	
	public ShallowCopy(int[] a) {
		this.a = a;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] anArray = {1, 2, 3, 4, 5};
		
		ShallowCopy sc = new ShallowCopy(anArray);
		sc.showData();
		anArray[0] = 999;
		sc.showData();
	
	}
	

}
