package datastructure.linkedlist;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("gan");
		list.addFirst("ann");
		list.addLast("bob");
		
		list.printContent();
		
		/*
		try {
			list.removeLast();
		} catch(NoSuchElementException e) {
			System.out.println(e.toString());
			
		}
		
		
		list.printContent();
		*/
		
		LinkedList<String> reverse = list.reverseList();
		reverse.printContent();
		
		try {
			reverse.removeLast();
		} catch(NoSuchElementException e) {
			System.out.println(e.toString());
			
		}
		
		reverse.printContent();
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.addInPlace(1);
		linkedList.addInPlace(3);
		linkedList.addInPlace(2);
		linkedList.addInPlace(5);
		linkedList.addInPlace(4);
		
		/*
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.addInPlace("cindy");
		linkedList.addInPlace("emy");
		linkedList.addInPlace("bobby");
		linkedList.addInPlace("dany");
		linkedList.addInPlace("andy");
		*/
		
		// print content of the list
		linkedList.printContent();
		
		LinkedList<Double> listOne = new LinkedList<Double>();
		LinkedList<Double> listTwo = new LinkedList<Double>();
		
		LinkedList<Double> mergedList = new LinkedList<Double>();
		
		listOne.addInPlace(3.0);
		listOne.addInPlace(2.0);
		listOne.addInPlace(1.0);
		listOne.addInPlace(4.0);
		
		listTwo.addInPlace(5.0);
		listTwo.addInPlace(7.0);
		listTwo.addInPlace(6.0);
		
		mergedList.mergedLinkedLists(listOne, listTwo, mergedList);
		mergedList.printContent();
		
		
		
		
		
		
		
	} // end of main()

} // LinkedListDemo
