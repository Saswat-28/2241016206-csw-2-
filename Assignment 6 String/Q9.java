package Assignment_6_String;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.next();
        System.out.print("Enter the word to replace it with: ");
        String replaceWord = scanner.next();
        int startIndex = sentence.indexOf(searchWord);
        int endIndex = startIndex + searchWord.length();
        String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(endIndex);
        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
        scanner.close();
    }
}
