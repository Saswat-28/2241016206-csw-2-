package Assignment_6_String;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        char choice = ' ';
        while (choice != 'f') {
            System.out.println("\nText Editor Menu:");
            System.out.println("a. Append text");
            System.out.println("b. Insert text at index");
            System.out.println("c. Delete text between indices");
            System.out.println("d. Reverse text");
            System.out.println("e. Replace text between indices");
            System.out.println("f. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case 'a':
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                case 'b':
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    System.out.print("Enter index to insert at: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    text.insert(index, insertText);
                    break;
                case 'c':
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    text.delete(startIndex, endIndex);
                    break;
                case 'd':
                    text.reverse();
                    break;
                case 'e':
                    System.out.print("Enter start index to replace: ");
                    int startReplaceIndex = scanner.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int endReplaceIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter replacement text: ");
                    String replacementText = scanner.nextLine();
                    text.replace(startReplaceIndex, endReplaceIndex, replacementText);
                    break;
                case 'f':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println("Current text: " + text);
            System.out.println("Current capacity: " + text.capacity());
            System.out.println("Current length: " + text.length());
        }
        scanner.close();
    }
}

