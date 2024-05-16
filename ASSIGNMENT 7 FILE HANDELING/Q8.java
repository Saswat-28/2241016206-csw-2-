package Assignment_7_File_Handling;

import java.io.File;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current file name: ");
        String currentFileName = scanner.nextLine();
        File currentFile = new File(currentFileName);
        if (!currentFile.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }
        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();
        File newFile = new File(newFileName);
        if (newFile.exists()) {
            System.out.println("A file with the specified new name already exists.");
            return;
        }
        if (currentFile.renameTo(newFile)) {
            System.out.println("File has been successfully renamed to '" + newFileName + "'.");
        } else {
            System.out.println("Failed to rename the file.");
        }
        scanner.close();
    }
}
