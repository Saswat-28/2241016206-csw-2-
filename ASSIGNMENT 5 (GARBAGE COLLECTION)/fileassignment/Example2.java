package fileassignment;
import java.util.*;
import java.io.*;
public class Example2 {

	public static void main(String[] args) {
		try {
			File ob=new File("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Output.txt");
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine()) {
				String word=sc.nextLine();
				System.out.println(word);
				System.out.println("Done");
			}
		}
		catch(IOException e) {
			System.out.println("Caught Exception");
		}
	}

}
