package Assignment_7_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();
        System.out.print("Enter the destination file path: ");
        String destinationFilePath = scanner.nextLine();
        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file '" + sourceFilePath + "' does not exist.");
            return;
        }
        if (destinationFile.exists()) {
            System.out.print("Destination file already exists. Do you want to overwrite it? (Y/N): ");
            String overwriteChoice = scanner.nextLine().trim().toUpperCase();
            if (!overwriteChoice.equals("Y")) {
                System.out.println("File copy operation canceled.");
                return;
            }
        }
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully from '" + sourceFilePath + "' to '" + destinationFilePath + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
        scanner.close();
    }
}
