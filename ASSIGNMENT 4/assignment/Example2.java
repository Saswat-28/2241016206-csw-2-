package assignment;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println("Start:"+start);
		ArrayList<Object>ob=new ArrayList<>();
		for (int i=0;i<1000;i++) {
            ob.add(new Object());
            if(i%1000==0) {
            	long pre=System.currentTimeMillis();   
            	System.out.println("Present:"+pre);
            }
        }
		long end=System.currentTimeMillis();
		System.out.println("End:"+end);
	}

}
