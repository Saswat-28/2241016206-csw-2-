package errorhandling;

public class Q4a {

	public static void main(String[] args) {
		try {
            System.out.println("Result: " + (34 / 2));
        } 
		catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } 
		finally {
            System.out.println("Finally executed");
        }
        
        System.out.println("Exception doesn't occur.");
    
	}

}
