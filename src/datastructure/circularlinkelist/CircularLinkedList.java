package datastructure.circularlinkelist;

import datastructure.linkedlist.Node; // importing Node class

public class CircularLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public CircularLinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public void insertAtFirst(E data) {
		Node<E> newNode = new Node<E> (data, head);
		
		if (head == null) {
			head = newNode;
			tail = head;
		}
		
		else {
			tail.setNext(newNode);
			head = newNode;
		}
		
		size++;
	} // end of addLast()
	
	public void insertAtLast(E data) {
		Node<E> newNode = new Node<E> (data, head);
		
		if (head == null) {
			head = newNode;
			tail = head;
		}
		
		else {
			tail.setNext(newNode);
			tail = newNode;

		}
		size++;	
		
	}
	
	public void insertAtPosition(E data, int position) {
		Node<E> newNode = new Node<E> (data, null);
		Node<E> current = head;
		
		// Element being entered in position 1
		if (position == 1 ) {
			insertAtFirst(data);
			size++;
		}
		
		// Element being entered at the end of the list
		else if (position == size) {
			insertAtLast(data);
			size++;
		}
		
		// Element being entered any position except in first and last position
		else {
			position = position - 1;
			
			for (int i = 1; i < size; i++) {
				if (i == position) {
					Node<E> temp = current.getNext();
					newNode.setNext(temp);
					current.setNext(newNode);
					size++;
				} // end of if
				
				current = current.getNext();
			} // end of for
			
		} // end of else
	} // insertAtPosition()
	
	public void deleteAtPosition(int position) {
		
		// If size of list is one or list has only one node
		if (size == 1 && position == 1) {
			head = null;
			tail = null;
			size = 0;
			return;
		} // end of if
		
		// If user wants to delete first node of the list
		if (position == 1) {
			head = head.getNext();
			tail.setNext(head);
			size--;
			return;
		} // end of if
		
		// If user wants to delete last node of the list
		if (position == size) {
			Node<E> current = head;
			Node<E> prev = null;
			
			while (current != tail) {
				prev = current;
				current = current.getNext();
			}
			
			tail = prev;
			tail.setNext(head);
			size--;
			return;
			
		} // end of if
		
		Node<E> current = head;
		position = position - 1;
		
		for (int i = 1; i < size; i++) {
			if (i == position) {
				Node<E> temp = current.getNext();
				temp = temp.getNext();
				current.setNext(temp);
				break;
			}
			
			current = current.getNext();
		}
		size--;
		
		
	} // end of deleteAtPosition()
	
	
	
	public void printList() {
		Node<E> top, current;
		current = head;
		
		System.out.print(current.data + " ");
		current = current.next;
		
		while (current != head) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println("\n");
	}

}
