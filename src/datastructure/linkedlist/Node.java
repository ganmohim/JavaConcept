package datastructure.linkedlist;

/**
 Data structure for a single node
*/
public class Node<E> {
    public E data;
    public Node<E> next;
    
    public Node (E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
    
    public Node() {
    	this.data = null;
    	this.next = null;
    }
    
    public void setNext(Node<E> next) {
    	this.next = next;
    }
    
    public Node<E> getNext() {
    	return next;
    }
    
    public E getData() {
    	return data;
    }
}
