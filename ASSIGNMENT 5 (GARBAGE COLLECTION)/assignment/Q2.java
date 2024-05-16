package assignment;

public class Q2 {

	public static void main(String[] args) {
		String s="Hello";
		CharSequence ch=s;
		System.out.println(ch.subSequence(0, 5));
		System.out.println(ch.length());
		
		StringBuilder sb=new StringBuilder(ch);
		sb.append("world");
		System.out.println(sb);
	}
}
