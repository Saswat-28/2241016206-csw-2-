package assignment;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
        	System.out.println("Enter a number: ");
            String input=sc.nextLine();
            int number = convertStringToInteger(input);
            System.out.println("Integer value: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            e.printStackTrace();
        } 
        finally {
            sc.close();
        }
    }
    
    public static int convertStringToInteger(String input) throws NumberFormatException {
        return Integer.parseInt(input);
	}

}
