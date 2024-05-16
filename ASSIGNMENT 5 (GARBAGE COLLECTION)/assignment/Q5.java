package assignment;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter the base string: ");
        String b=sc.nextLine();

        System.out.print("Enter the number of concatenations: ");
        int n=sc.nextInt();

        long start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder(b);
        for (int i=1;i<n;i++) {
            sb.append(b);
        }
        long end=System.currentTimeMillis();
        long time=end-start;

        long starts=System.currentTimeMillis();
        StringBuffer sbb=new StringBuffer(b);
        for (int i=1;i<n;i++) {
            sbb.append(b);
        }
        long ends=System.currentTimeMillis();
        long times=ends-starts;
        
        System.out.println("\nUsing StringBuilder...");
        System.out.println("Time taken: " +time+ " milliseconds");
        System.out.println("Final string length: " +sb.length());

        System.out.println("\nUsing StringBuffer...");
        System.out.println("Time taken: " +times+ " milliseconds");
        System.out.println("Final string length: " +sbb.length());

        long diff=Math.abs(time-times);
        System.out.println("\nComparison: " +(time<times? "StringBuilder was faster" : "StringBuffer was faster")
                + " than StringBuffer by " +diff+ " milliseconds.");

        sc.close();
	}

}
