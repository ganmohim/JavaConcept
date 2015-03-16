package datastructure.linkedlist;

public class NoSuchElementException extends Exception {
	String msg;
	
	public String toString() {
		msg = "No such element exception";
		return msg;
	}

}
