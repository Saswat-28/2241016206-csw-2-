package Assignment_6_String;
public class Q6 {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "hello";
        String firstLower = firstString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
        String secondLower = secondString.toLowerCase();
        String secondUpper = secondString.toUpperCase();
        boolean equalIgnoreCase = firstLower.equals(secondLower);
        System.out.println("\nConverted strings:");
        System.out.println("First string (lowercase): " + firstLower);
        System.out.println("First string (uppercase): " + firstUpper);
        System.out.println("Second string (lowercase): " + secondLower);
        System.out.println("Second string (uppercase): " + secondUpper);
        System.out.println("\nCase-insensitive equality: " + (equalIgnoreCase ? "The strings are equal." : "The strings are not equal."));
    }
}
