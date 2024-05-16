package Assignment_7_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        File file = new File("diary.txt");
        if (!file.exists()) {
            System.out.println("The file 'diary.txt' does not exist.");
            return;
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
