package fileassignment.Q5;
import java.io.*;
import java.util.*;
public class Question {

	public static void main(String[] args) {
		File f=new File("D:\\");
		if(f.exists())
			System.out.println("File is present.");
		else
			System.out.println("File is not present.");
		File ob[]=f.listFiles();
		for(File i: ob) {
			if(i.isFile())
				System.out.println("File name: "+i.getName().endsWith(".txt"));
			if(i.isDirectory())
				System.out.println("File name: "+i.getName());
		}
	}

}
