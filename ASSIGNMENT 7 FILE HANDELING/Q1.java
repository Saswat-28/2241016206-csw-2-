package Assignment_7_File_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        File file = new File("diary.txt");
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write("\nDate: " + formattedDate + "\nEntry: " + entry + "\n");
            writer.close();
            System.out.println("Diary entry has been added to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        System.out.println(file.getAbsolutePath());
        scanner.close();
    }
}
