package string;

public class Example13 {
	 public static void main(String[] args) {
	        String str="Java is a programming language.";
	        remove(str,"programming");
	    }
	    public static void remove(String str, String word) {
	        String s=str.replaceAll(word," ").trim();
	        System.out.println(s);
	    }
	}
 