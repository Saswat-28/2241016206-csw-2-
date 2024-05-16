package assignment;
import java.util.*;
public class Q25 {

	public static void main(String[] args) {
		int userInput=readIntegerFromUser();
		System.out.println("User entered: "+userInput);
	}
	public static int readIntegerFromUser() {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                userInput = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); 
            }
        }
        sc.close();
        return userInput;
	}

}
