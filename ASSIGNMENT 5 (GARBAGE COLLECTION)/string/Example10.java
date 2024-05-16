package string;

public class Example10 {

	public static void main(String[] args) {
		//StringBuilder is not synchronized
		StringBuffer sb=new StringBuffer("Hello");
		StringBuilder sb1=new StringBuilder(sb.toString());
		System.out.println(sb1);
	}

}
