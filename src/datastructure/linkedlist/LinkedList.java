package datastructure.linkedlist;

public class LinkedList<E extends Comparable<E> > {

    private Node<E> head;
    
    public LinkedList() {
        head = null;
    }
    
    public void addFirst(E data) {
        head = new Node<E>(data, head);
    }
    
    // Load item into linked in sorted order
    public void addInPlace(E data) {
    	Node<E> curr, prev, np;
    	prev = null;
    	np = new Node<E> (data, null);
    	curr = head;
    	
    	while (curr != null && data.compareTo(curr.data) > 0) {
    		prev = curr;
    		curr = curr.next;
    	} // end of while
    	
    	np.next = curr;
    	if (prev == null)
    		head = np; // this node is the new head
    	else
    		prev.next = np; // prev node now re-points to new node
    } // addInPlace()
    
    
    public void addLast(E data) {
        if (head == null)
            addFirst(data);
        else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            
            temp.next = new Node<E> (data, null);
        } // end of else
        
        
    } // end of addLast()
    
    public E removeFirst() throws NoSuchElementException {
    	Node<E> temp;
        if (head == null)
            throw new NoSuchElementException();
        else {
            temp = head;
            head = head.next;
    
        } // end of else
        
        return temp.data;
        
    } // end of removeFirst()
    
    public E removeLast() throws NoSuchElementException {
        Node<E> temp;
        Node<E> prev = new Node<E> ();
        E data;
        if (head == null)
            throw new NoSuchElementException();
        else {
            temp = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
                
            } // end of while
            
            data = prev.data;
            prev.next = null;
                   
            
        } //end of else
        
        return data;
    } // end of remove last
    
    // Reverse a linked list
    public LinkedList<E> reverseList() {
    	Node<E> temp = head;
    	LinkedList<E> rl = new LinkedList<E>();
    	while (temp.next != null) {
    		rl.addFirst(temp.data);
    		temp = temp.next;
    	}
    	
    	rl.addFirst(temp.data);
    	
    	return rl;
    	
    }
    
    public void mergedLinkedLists(LinkedList<E> listOne, 
    		LinkedList<E> listTwo, LinkedList<E> mergedList) {
    	
    	Node<E> listOneCurr = listOne.head;
    	Node<E> listTwoCurr = listTwo.head;

    	while (listOneCurr != null && listTwoCurr != null) {
    		
    		if (listOneCurr.data.compareTo(listTwoCurr.data) > 0) {
    			mergedList.addLast(listTwoCurr.data);
    			listTwoCurr = listTwoCurr.next;
    		} // end of if
    		
    		else {
    			mergedList.addLast(listOneCurr.data);
    			listOneCurr = listOneCurr.next;
    		}
    		
    	} // end of while
    	
    	// List one is finished. Copy over rest of the elements of list two
    	if (listOneCurr == null) {
    		while (listTwoCurr != null) {
    			mergedList.addLast(listTwoCurr.data);
    			listTwoCurr = listTwoCurr.next;
    		}
    		
    	} // end of if
    	
    	// List two is finished. Copy over rest of the elements of list one
    	else {
    		while (listOneCurr != null) {
    			mergedList.addLast(listOneCurr.data);
    			listOneCurr = listOneCurr.next;
    		}
    		
    	} // end of else
    	
    } // end of mergedLinkedList()
    
    
    public void printContent() {
    	Node<E> temp = head;
    	
    	while (temp != null) {
    		System.out.print(temp.data + " ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    
    public Node<E> getHead() {
    	return head;
    }
    
} // end of class

