package generics;
import java.util.*;

public class Maxmin {

    public static void printMaxMin(int[] num) {
        Arrays.sort(num);
        
        int n=num.length;
        int left=0,right=n-1;
        
        while(left<=right) {
            System.out.println(num[right]);
            right--;
            
            if(left<=right) {
                System.out.println(num[left]);
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        printMaxMin(num);
    }
}
