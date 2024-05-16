package errorhandling;

public class Q4b {

	public static void main(String[] args) {
		try {
            System.out.println("Result: " + (34/0)); 
        } 
		catch (ArithmeticException e) {
            System.out.println("Exception not handled");
        } 
		finally {
            System.out.println("Finally executed");
        }
        
        System.out.println("Exception occurs.");
    
	}

}
