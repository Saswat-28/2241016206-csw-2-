package errorhandling;

import java.io.FileInputStream;

public class Example3 {

	public static void main(String[] args) {
		try {
			FileInputStream ob= new FileInputStream("D:\\2241002067\\Chapter12\\Chapter14\\src\\Test3.txt");
			int i=ob.read();
			System.out.println((char)i);
			ob.close();
			}
			catch(Exception e){
				System.out.println("Exception handled");
			}
	}

}
