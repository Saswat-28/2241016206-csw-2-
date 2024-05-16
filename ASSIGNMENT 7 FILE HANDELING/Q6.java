package Assignment_7_File_Handling;

import java.io.File;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to delete: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File '" + filename + "' does not exist.");
            return;
        }
        if (file.delete()) {
            System.out.println("File '" + filename + "' has been successfully deleted.");
        } else {
            System.out.println("Error occurred while deleting the file '" + filename + "'.");
        }
        scanner.close();
    }
}
