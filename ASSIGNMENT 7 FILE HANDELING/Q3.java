package Assignment_7_File_Handling;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your new diary entry: ");
        String newEntry = scanner.nextLine();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDate);
        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write("\nDate & Time: " + formattedDateTime + "\n");
            writer.write("Entry: " + newEntry + "\n");
            System.out.println("New diary entry has been added to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        scanner.close();
    }
}
