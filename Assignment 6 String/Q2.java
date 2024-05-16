package Assignment_6_String;

public class Q2 {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
        CharSequence sequence = "Java";
        System.out.println("Length of the sequence: " + sequence.length());
        System.out.println("Character at index 2: " + sequence.charAt(2));
        System.out.println("Subsequence from index 1 to 3: " + sequence.subSequence(1, 3));
    }
}
