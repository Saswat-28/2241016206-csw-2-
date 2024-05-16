package Assignment_6_String;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        char choice = ' ';
        while (choice != 'e') {
            System.out.println("\nChoose an operation:");
            System.out.println("a. Add a substring at a specified position");
            System.out.println("b. Remove a range of characters");
            System.out.println("c. Modify a character at a specified index");
            System.out.println("d. Concatenate another string at the end");
            System.out.println("e. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.print("Enter substring to add: ");
                    String substringToAdd = scanner.next();
                    System.out.print("Enter position to add: ");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    break;
                case 'b':
                    System.out.print("Enter start index to remove: ");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.print("Enter end index to remove: ");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 'c':
                    System.out.print("Enter index to modify: ");
                    int indexToModify = scanner.nextInt();
                    System.out.print("Enter character to replace with: ");
                    char characterToReplace = scanner.next().charAt(0);
                    stringBuilder.setCharAt(indexToModify, characterToReplace);
                    break;
                case 'd':
                    System.out.print("Enter string to concatenate: ");
                    String stringToConcatenate = scanner.next();
                    stringBuilder.append(stringToConcatenate);
                    break;
                case 'e':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println("Modified string: " + stringBuilder);
        }
        scanner.close();
    }
}
