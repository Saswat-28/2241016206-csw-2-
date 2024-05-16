package fileassignment;

import java.io.*;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		try {
			File ob=new File("Input.txt");
			if(ob.createNewFile()) {
				System.out.println("File is created "+ ob.getName());
			}
			else {
				System.out.println("FIle is not created");
			}
			FileWriter writer=new FileWriter("Input.txt");
			writer.write("JAVA is a good program.");
			writer.close();
		}
		catch(Exception e) {
			System.out.println("Exception"+e.getMessage());
		}
	}

}
