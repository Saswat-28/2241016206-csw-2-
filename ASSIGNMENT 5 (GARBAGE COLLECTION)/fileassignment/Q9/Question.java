package fileassignment.Q9;
import java.io.*;
import java.util.*;
public class Question {

	public static void main(String[] args) {
		File f=new File("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Q9\\Empty.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.canExecute());
			System.out.println(f.lastModified());
		}
	}

}
