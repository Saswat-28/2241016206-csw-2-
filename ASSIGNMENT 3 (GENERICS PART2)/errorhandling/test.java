package errorhandling;

public class test {
         public static void main(String[]args) {
        	 int age=17;
        	 try {
        		validate(age);
        	 }catch (ArithmeticException e) {
        		 System.out.println(e.getMessage()); 
        	 }
        	 
         }

		public static void validate(int age) {
			if(age<18) {
				throw new ArithmeticException ("the person is not eligible to vote");
					
				}
				else {
					System.out.println("The person is eligible to vote");
				}
			}
			
		}
	
	


