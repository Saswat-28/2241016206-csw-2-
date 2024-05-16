package assignment;
import java.io.FileInputStream;
import java.io.IOException;
public class Q23 {

	public static void main(String[] args) {
		String loc="D:\\2241002067\\Chapter12\\Chapter14\\src\\assignment\\File24.txt";
		try {
			FileInputStream fis=new FileInputStream(loc);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
		}
		catch(IOException e) {
			System.out.println("An error occured.File not found."+e.getMessage());
		}
	}

}
