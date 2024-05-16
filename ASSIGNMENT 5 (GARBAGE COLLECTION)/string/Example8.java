package string;

public class Example8 {

	public static void main(String[] args) {
		//StringBuffer is synchronized
		StringBuffer sb1=new StringBuffer();
		sb1.append("Hello");
		System.out.println(sb1);
		int c1=sb1.capacity();
		System.out.println("Capacity:"+c1);
		
		System.out.println();
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("Java is a language");
		System.out.println(sb2);
		int c2=sb2.capacity();
		System.out.println("Capacity:"+c2);
		
	}

}
