package errorhandling;

import java.io.FileOutputStream;

public class Example2 {

	public static void main(String[] args) {
		try {
			FileOutputStream ob= new FileOutputStream("D:\\2241002067\\Chapter12\\Chapter14\\src\\Test2.txt");
			String s="Hello World";
			byte[] b=s.getBytes();
			ob.write(b);
			System.out.println("Successful");
			ob.close();
			}
			catch(Exception e){
				System.out.println("Exception handled");
			}
	}
}


