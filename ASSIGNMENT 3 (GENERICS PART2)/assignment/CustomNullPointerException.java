package assignment;

public class CustomNullPointerException extends RuntimeException {
    
    public CustomNullPointerException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        String input = null;
        try {
            if (input == null) {
                throw new CustomNullPointerException("Input string is null.");
            }
        } 
        catch (CustomNullPointerException e) {
        	System.out.println("CustomNullPointerException caught!");
            System.out.println(e.getMessage());
        }
    }
}

