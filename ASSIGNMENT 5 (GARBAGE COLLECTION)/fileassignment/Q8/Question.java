package fileassignment.Q8;
import java.io.*;
import java.util.*;
public class Question {

	public static void main(String[] args) {
		File ob4=new File("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Q8\\Input3.txt");
		File ob5=new File("D:\\2241002067\\Chapter12\\Chapter16\\src\\fileassignment\\Q8\\Input13.txt");
		boolean flag=ob4.renameTo(ob5);
		if(flag) {
			System.out.println("Done");
		}
		else {
			System.out.println("Not done");
		}
	}

}
