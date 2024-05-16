package string;

public class Example2 {

	public static void main(String[] args) {
		String str=new String("Archit");
		for(int i=1;i<str.length();i=i+2) {
			System.out.println(str.charAt(i));
		}
	}

}
