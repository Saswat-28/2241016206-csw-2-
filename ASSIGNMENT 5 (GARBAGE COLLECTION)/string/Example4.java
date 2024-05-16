package string;

public class Example4 {

	public static void main(String[] args) {
		String str=new String("Arrrrrrchit");
		
		char ch='r';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count of char "+ch+" is "+count);
	}

}
