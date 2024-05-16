package errorhandling;
import java.io.*;
public class Example1 {
	
	public static void main(String[] args) {
		try {
		FileOutputStream ob= new FileOutputStream("D:\\2241002067\\Chapter12\\Chapter14\\src\\Test1.txt");
		ob.write(65);
		System.out.println("Successful");
		ob.close();
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
	}
}
