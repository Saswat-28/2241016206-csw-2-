package assignment2p2;
import java.util.*;
public class Anagram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str1=sc.next();
		String str2=sc.next();
		HashMap<Character,Integer> map=new HashMap<>();
		if(str1.length()!=str2.length()) {
			System.out.println("These are not anagrams.");
		}
		else {
			for(int i=0;i<str1.length();i++) {
				char ch=str1.charAt(i);
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
			for(int i=0;i<str2.length();i++) {
				char ch=str2.charAt(i);
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)-1);
				}
				else {
					System.out.println("These are not anagrams");
					System.exit(0);
				}
			}
			for(int i=0;i<str1.length();i++) {
				char ch=str1.charAt(i);
				if(map.get(ch)!=0) {
					System.out.println("These are not anagrams.");
					System.exit(0);
				}
			}
			System.out.println("These are anagrams.");
		}
	}
}
