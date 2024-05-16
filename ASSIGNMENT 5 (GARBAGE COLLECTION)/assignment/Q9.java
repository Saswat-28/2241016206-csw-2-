package assignment;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence=sc.nextLine();

	        System.out.print("Enter the word to search for: ");
	        String searchWord=sc.next();

	        System.out.print("Enter the word to replace it with: ");
	        String replaceWord=sc.next();

	        int index=sentence.indexOf(searchWord);

	        if (index!=-1) {
	            
	            String modifiedSentence=sentence.substring(0,index)
	                    .concat(replaceWord)
	                    .concat(sentence.substring(index+searchWord.length()));

	            System.out.println("\nOriginal sentence: " + sentence);
	            System.out.println("Modified sentence: " + modifiedSentence);
	        } 
	        else {
	            System.out.println("The word to search for was not found in the sentence.");
	        }

	        sc.close();
	}

}
