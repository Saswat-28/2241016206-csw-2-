package assignment2p2;
import java.util.*;

public class Q11 {
    public static int small(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1; i<=10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
		return 0;
    }

    public static void main(String[] args) {
        int[] arr={3,7,1,2,5,6,9,10};
        int n=small(arr);
        System.out.println("The smallest missing positive number is: "+n);
    }
}


