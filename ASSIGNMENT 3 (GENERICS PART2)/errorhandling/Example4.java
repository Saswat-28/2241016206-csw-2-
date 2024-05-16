package errorhandling;

import java.io.FileInputStream;

public class Example4 {

	public static void main(String[] args) {
		try {
			FileInputStream ob= new FileInputStream("D:\\2241002067\\Chapter12\\Chapter14\\src\\Test4.txt");
			int i=0;
			while((i=ob.read())!=-1) {
			System.out.print((char)i);
			}
			ob.close();
			}
			catch(Exception e){
				System.out.println("Exception handled");
			}
	}

}
