package assignment;

public class Q18 {
    public static void main(String[] args) {
        int[] arr = {10,7,9,11,8};
        int index = 0;
        traverseArray(arr,index);
    }

    public static void traverseArray(int[] arr, int index) {
        try {
            if (index>=arr.length) {
                System.out.println("Reached end of array.");
                return;
            }
            
            System.out.println("Element at index " +index+ ": " +arr[index]);
            
            traverseArray(arr,index+1); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Recursion terminated.");
        }
    }
}