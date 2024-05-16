package Assignment_6_String;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();
        System.out.println("\nUsing StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilderResult = new StringBuilder();
        for (int i = 0; i < numConcatenations; i++) {
            stringBuilderResult.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        System.out.println("Time taken: " + elapsedTimeStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilderResult.length());
        System.out.println("\nUsing StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBufferResult = new StringBuffer();
        for (int i = 0; i < numConcatenations; i++) {
            stringBufferResult.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Time taken: " + elapsedTimeStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBufferResult.length());
        long difference = Math.abs(elapsedTimeStringBuffer - elapsedTimeStringBuilder);
        String faster = elapsedTimeStringBuilder < elapsedTimeStringBuffer ? "StringBuilder" : "StringBuffer";
        System.out.println("\nComparison: " + faster + " was faster than " + (faster.equals("StringBuilder") ? "StringBuffer" : "StringBuilder") + " by " + difference + " milliseconds.");
        scanner.close();
    }
}
