package errorhandling;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<length;i++) {
            array[i]=sc.nextInt();
        }
        
        System.out.print("Enter the index you want to access: ");
        int index = sc.nextInt();
        try {
            int value = array[index];
            System.out.println("The value at index " +index+ " is: " +value);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds. Please enter a valid index.");
        }
        sc.close();
    }
}

