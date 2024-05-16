package string;

public class Example9 {

	public static void main(String[] args) {
		StringBuffer sb3=new StringBuffer();
		sb3.append("Hello");
		sb3.insert(1,"world");
		System.out.println(sb3);
		sb3.replace(2,5,"abc");
		System.out.println(sb3);
		sb3.delete(1,3);
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
	}

}
