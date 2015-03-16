package sorting;

public class BubbleSort<T extends Comparable<T> > {
    
    public void bubbleSort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    T temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                } // end of if
            } // end of for
        } // end of outer for
    } // end of bubbleSort()
    
    public void printSorted(T[] a) {
        for (T i : a) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
    	Integer a[] = { 3, 2, 10, 0, 7};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(a);
        bs.printSorted(a);
        
        Character c[] = {'z', 'o', 'a', 'd', 'c'};
        bs.bubbleSort(c);
        bs.printSorted(c);
        
        String[] str = {"zen", "bob", "linda", "ann"};
        bs.bubbleSort(str);
        bs.printSorted(str);
        
    }

}
