package Assignment_7_File_Handling;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }
        File[] filesAndDirectories = directory.listFiles();
        System.out.println("\nFiles and Subdirectories in the specified directory:");
        for (File fileOrDirectory : filesAndDirectories) {
            if (fileOrDirectory.isFile()) {
                System.out.println("File: " + fileOrDirectory.getName());
            } else if (fileOrDirectory.isDirectory()) {
                System.out.println("Directory: " + fileOrDirectory.getName());
            }
        }
        scanner.close();
    }
}
