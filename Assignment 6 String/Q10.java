package Assignment_6_String;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        char choice = ' ';
        while (choice != '6') {
            System.out.println("\nString Explorer Menu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Get character at index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
            switch (choice) {
                case '1':
                    System.out.println("Lowercase: " + inputString.toLowerCase());
                    break;
                case '2':
                    System.out.println("Uppercase: " + inputString.toUpperCase());
                    break;
                case '3':
                    System.out.print("Enter character to search: ");
                    char searchChar = scanner.next().charAt(0);
                    if (inputString.contains(String.valueOf(searchChar))) {
                        System.out.println("Character '" + searchChar + "' found at index " + inputString.indexOf(searchChar));
                    } else {
                        System.out.println("Character '" + searchChar + "' not found.");
                    }
                    break;
                case '4':
                    System.out.print("Enter index to retrieve character: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        System.out.println("Character at index " + index + ": " + inputString.charAt(index));
                    } else {
                        System.out.println("Invalid index. Please enter a valid index within the range of the string.");
                    }
                    break;
                case '5':
                    System.out.print("Enter string to concatenate: ");
                    String appendString = scanner.next();
                    System.out.println("Concatenated string: " + inputString.concat(appendString));
                    break;
                case '6':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}
