package fileassignment;
import java.io.*;
import java.time.*;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your diary entry: ");
		String entry=sc.nextLine();
		sc.close();
		File file=new File("diary.txt");
		try {
			if(file.exists()) {
				System.out.println("File exists.");
			}
			LocalDate dt=LocalDate.now();
			String output=dt+entry+" ";
			System.out.println(dt);
			FileWriter writer=new FileWriter(file, true);
			writer.write(output);
			writer.close();
			System.out.println("Diary entry added successfully");
		}
		catch(IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}
	
}
