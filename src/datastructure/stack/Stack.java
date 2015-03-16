package datastructure.stack;


public class Stack<E> {
    private Node<E> head;
    
    public Stack() {
        head = null;
    }
    
    public void push(E data) {
        head = new Node<E>(data, head);
    }
    
    public E pop() throws NoSuchElementException {
    	Node<E> temp;
        if (head == null)
            throw new NoSuchElementException("No element to pop");
        else {
            temp = head;
            head = head.next;
            
        }
        
        return temp.data;
    }
    
    // Peek at the first element of the stack
    public E peek() {
        return head.data;
    }
    
    // print the content of the stack
    public void printContent() {
        Node<E> temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

} // end of Stack class