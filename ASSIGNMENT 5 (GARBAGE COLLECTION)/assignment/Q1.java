package assignment;

public class Q1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		
		//Checking s1 and s2
        System.out.println("Using string literals:");
        System.out.println("s1==s2: "+(s1==s2));
        System.out.println();
        
        //Checking s3 and s4
        System.out.println("Using 'new' keyword:");
        System.out.println("s3==s4: "+(s3==s4));
        System.out.println();
        
        //Checking s1 and s3
        System.out.println("Using both:");
        System.out.println("s1==s3: "+(s1==s3));
        System.out.println();
        
        System.out.println("Memory usage: ");
        System.out.println("S1 size: "+getSize(s1));
        System.out.println("S3 size: "+getSize(s3));
	}
        
        public static long getSize(String s) {
        	return s.length()*2;
        }
	

}
