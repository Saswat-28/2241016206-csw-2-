package string;

public class Example12 {
	//Method 1
	public static void remove(String str, String word) {
        StringBuilder sb=new StringBuilder();
        String[] words=str.split(" ");
        for(String w:words) {
            if(!w.equals(word)) {
                sb.append(w).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

	public static void main(String[] args) {
		String s="Java is a programming language.";
		remove(s,"programming");
	}

}
