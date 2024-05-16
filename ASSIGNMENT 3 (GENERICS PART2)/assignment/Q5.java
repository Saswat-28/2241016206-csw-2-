package assignment;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            Double number = sc.nextDouble();
            double result = performComplexComputation(number);
            System.out.println("Result: " + result);
        } 
        catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred. Please provide valid input.");
        } 
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        } 
        finally {
            sc.close();
        }
    }
    
    public static double performComplexComputation(double number) {
        double result = Math.log(Math.sin(number) + Math.cos(number)) + Math.sqrt(number);
        return result;
	}

}
