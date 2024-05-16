package assignment;
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer number: ");
            int number = sc.nextInt();
            double squareRoot = findSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException occurred. Cannot find square root of a negative number.");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
    
    public static double findSquareRoot(int number) throws ArithmeticException {
        if (number < 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(number);
	}

}
