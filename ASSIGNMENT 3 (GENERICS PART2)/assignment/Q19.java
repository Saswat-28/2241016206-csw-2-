package assignment;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int searchKey = 9;
        int index = searchArray(arr, searchKey);
        if (index != -1) {
            System.out.println("Element " + searchKey + " found at index " + index);
        } 
        else {
            System.out.println("Element " + searchKey + " not found in the array");
        }
        
        try {
            System.out.println("Element at index 10: " + arr[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Could not access element at index 10.");
        }
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static int searchArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}