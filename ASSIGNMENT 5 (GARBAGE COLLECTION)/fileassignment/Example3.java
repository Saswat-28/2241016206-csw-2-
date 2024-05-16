package fileassignment;
import java.io.*;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		File ob=new File("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\delete.txt");
		if(ob.delete()) {
			System.out.println("File deleted.");
		}
		else {
			System.out.println("File not deleted.");
		}
	}

}
