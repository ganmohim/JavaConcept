package datastructure.stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
   
		try {
			st.pop();
		} catch(NoSuchElementException e) {
			System.out.println("Exception: " + e);
		} // end of catch
   
		System.out.println("Top element is: " + st.peek());
		st.printContent();
	}
}