package assignment;
import java.util.*;
public class Q6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            e.printStackTrace();
        } 
        finally {
            sc.close();
        }
	}

}
