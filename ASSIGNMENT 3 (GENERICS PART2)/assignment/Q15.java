package assignment;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		String str = "abc"; 
        
        try {
            int num1 = Integer.parseInt(str);
            
            try {
                int result = num1 / 0;
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught inside inner try-catch block: " + e.getMessage());
            }
            
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught in outer try-catch block: " + e.getMessage());
        }
	}
}
