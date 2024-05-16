package string;

public class Example3 {

	public static void main(String[] args) {
		String str=new String("Hello");
		String str2=new String("Hello");
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.concat(str2));
		
		for(int i=0;i<str.length();) {
			if(str.charAt(i)!=str2.charAt(i)) {
				System.out.println("Both strings are different.");
				break;
			}
			else {
				System.out.println("Both are same.");
				break;
			}
		}
	
	}

}
