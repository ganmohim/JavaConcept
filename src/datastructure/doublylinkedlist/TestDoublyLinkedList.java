package datastructure.doublylinkedlist;

public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList<String> dl = new DoublyLinkedList<String>();
		dl.insertAtFirst("alex");
		dl.insertAtFirst("boby");
		dl.insertAtLast("dan");
		dl.insertAtLast("sam");
		
		dl.insetAtPosition("adam", 1);
		dl.insetAtPosition("gan", 1);
		
		dl.printDoublyLinkedList();
		
		dl.removeAtPosition(6);
		dl.printDoublyLinkedList();
	}
}
