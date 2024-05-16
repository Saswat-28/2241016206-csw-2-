package Assignment_7_File_Handling;

import java.io.File;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }
        System.out.println("Contents of directory '" + directoryPath + "':");
        listFilesAndSubdirectories(directory, 0);

        scanner.close();
    }
    private static void listFilesAndSubdirectories(File directory, int depth) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                StringBuilder indentation = new StringBuilder();
                for (int i = 0; i < depth; i++) {
                    indentation.append("  ");
                }
                System.out.println(indentation.toString() + file.getName());
                if (file.isDirectory()) {
                    listFilesAndSubdirectories(file, depth + 1);
                }
            }
        }
    }
}
