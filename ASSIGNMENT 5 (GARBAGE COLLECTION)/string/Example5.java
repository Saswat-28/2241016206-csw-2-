package string;

public class Example5 {

	public static void main(String[] args) {
		String s1=new String("Hello");
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
