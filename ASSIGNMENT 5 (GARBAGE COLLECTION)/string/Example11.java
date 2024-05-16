package string;

public class Example11 {
    public static void main(String[] args) {
        String s="This is a long string to reverse";
        String[] w=s.split(" ");
        String[] r=new String[w.length];
        for (int i=0;i<w.length;i++) {
            r[i]=reverseWord(w[i]);
        }
        StringBuilder sb1=new StringBuilder();
        for (String word:r) {
            sb1.append(word).append(" ");
        }

        System.out.println("Original: "+s);
        System.out.println("Reverse: "+sb1.toString());
    }

    private static String reverseWord(String word) {
        StringBuilder sb=new StringBuilder(word);
        return sb.reverse().toString();
    }
}

