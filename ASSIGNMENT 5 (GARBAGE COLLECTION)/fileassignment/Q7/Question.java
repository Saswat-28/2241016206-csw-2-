package fileassignment.Q7;
import java.io.*;
public class Question {

	public static void main(String[] args) {
		try {
			FileInputStream ob=new FileInputStream("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Q7\\File1.txt");
			FileOutputStream ob1=new FileOutputStream("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Q7\\File2.txt");
			int i=0;
			while((i=ob.read())!=-1) {
				ob1.write((char)i);
			}
			
		}
		catch(IOException e) {
			System.out.println("Caught Exception");
		}
	}

}
