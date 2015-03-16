package searching;

public class BinarySearchDemo {
	
    public int binarySearch(int startIndex, int endIndex, int[] a, int valueToFind) {
        
    	if (startIndex > endIndex) 
    		return -1;
    	
    	int midIndex   = (startIndex + endIndex) / 2;    
        if (a[midIndex] == valueToFind) {
            return midIndex;
        }
        
        else if(valueToFind < a[midIndex])
            return binarySearch(startIndex, midIndex-1, a, valueToFind);
            
        else
            return binarySearch(midIndex+1, a.length-1, a, valueToFind);
        
    }
    
    
    public static void main(String[] args) {
        BinarySearchDemo bs = new BinarySearchDemo();
        int[] a        = {10, 20, 30, 40, 50};
        int valueToFind= 10;
        int foundIndex = bs.binarySearch(0, a.length-1, a, valueToFind);
        
        System.out.println(valueToFind + " is found? " + foundIndex);
    }
}
