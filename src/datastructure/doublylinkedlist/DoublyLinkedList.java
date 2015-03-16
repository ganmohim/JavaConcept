package datastructure.doublylinkedlist;

public class DoublyLinkedList<E> {
	
	private Node<E> head, tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void insertAtFirst(E data) {
		Node<E> newNode = new Node<E> (data, null, null);
		
		if (head == null) {
			head = newNode;
			tail = head;
		}
		
		else {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}
	
	public void insertAtLast(E data) {
		Node<E> newNode = new Node<E> (data, null, null);
		
		if (head == null) {
			head = newNode;
			tail = head;
		}
		
		else {
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	
	public void insetAtPosition(E data, int position) {
		Node<E> newNode = new Node<E> (data, null, null);
		
		if (position == 1) {
			insertAtFirst(data);
		}
		
		else {
			Node<E> current = head;
			
			for (int i = 2; i <= size; i++) {
				if (i == position) {
					
					Node<E> temp = current.getNext(); // temp node saving referenc to next node
					newNode.setNext(temp);
					temp.setPrev(newNode);
					current.setNext(newNode);
					newNode.setPrev(current);
	
					size++;
				} // end of if
				
				current = current.getNext(); // move to the next node
			} // end of for
			
		} // end of else
		
	} // end of insetAtPosition()
	
	public void removeAtPosition(int position) {
		if (position == 1) {
			if (size == 1) {
				head = null;
				tail = null;
				size = 0;
			}
			
			else {
				head = head.getNext(); // head--[]-->[]-->[]
				size--;
			}
			
		} // end of if
		
		else {
			Node<E> current = head.getNext();
			
			for (int i = 2; i <= size; i++) {
				if (i == position) {
					Node<E> tempNext = current.getNext();
					Node<E> tempPrev = current.getPrev();
					
					tempPrev.setNext(tempNext);
					tempNext.setPrev(tempPrev);
					size--;
					return;
				} // end of if
				current = current.getNext();
				
			} // end of for
			
		} // end of else
		
		
		
	}
	
	public void printDoublyLinkedList() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
			
		}
		
		System.out.println("\n");
	}
	

}
