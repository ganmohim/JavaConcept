package datastructure.circularlinkelist;

public class TestCirculatLinkedList {
	public static void main(String[] args) {
		CircularLinkedList<Integer> cLink = new CircularLinkedList<Integer>();
		cLink.insertAtFirst(1);
		cLink.insertAtFirst(2);
		cLink.insertAtFirst(3);
		cLink.insertAtFirst(4);
		cLink.printList();
		
		System.out.println("Inserting 100 at position 3");
		cLink.insertAtPosition(100, 3);
		cLink.printList();
		cLink.deleteAtPosition(4);
		cLink.printList();
	}

}
