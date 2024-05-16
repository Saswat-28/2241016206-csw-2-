package Assignment_6_String;
import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();
        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        System.out.println("\nCharacter array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at index: " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "' at index: " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
        scanner.close();
    }
}
