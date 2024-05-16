package assignment;

public class Q1 {

	public static void main(String[] args) {
		try {
            String s= null;
            int l= s.length();
            System.out.println("Length of string: "+l);
        } 
		catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            e.printStackTrace();
        }
	}

}
