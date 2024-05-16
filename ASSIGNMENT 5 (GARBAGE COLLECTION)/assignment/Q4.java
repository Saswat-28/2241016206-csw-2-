package assignment;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Display the current string");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Enter substring to add: ");
                String subString = scanner.nextLine();
                System.out.print("Enter position to add: ");
                int position = scanner.nextInt();
                stringBuilder.insert(position, subString);
                break;
            case 2:
                System.out.print("Enter start index to remove: ");
                int startIndex = scanner.nextInt();
                System.out.print("Enter end index to remove: ");
                int endIndex = scanner.nextInt();
                stringBuilder.delete(startIndex, endIndex);
                break;
            case 3:
                System.out.print("Enter index to modify: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new character: ");
                char newChar = scanner.nextLine().charAt(0);
                stringBuilder.setCharAt(index, newChar);
                break;
            case 4:
                System.out.print("Enter string to concatenate: ");
                String concatString = scanner.nextLine();
                stringBuilder.append(concatString);
                break;
            case 5:
                System.out.println("Current string: " + stringBuilder.toString());
                break;
            case 6:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    } 
        while (choice != 6);
	}

}
