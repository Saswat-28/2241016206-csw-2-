package assignment;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    
    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
	}

}
