package assignment2p2;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		System.out.println("Enter number of integers: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Repeating elements are: ");
		for(int i=0;i<n;i++) {
			if(set.contains(arr[i])) {
				System.out.println(arr[i]);
			}
			else {
				set.add(arr[i]);
			}
		}
		sc.close();
	}

}
