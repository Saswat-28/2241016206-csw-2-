package assignment2p2;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		
        TreeSet<Integer> tm = new TreeSet<>();
        tm.add(10);
        tm.add(20);
        tm.add(30);
        tm.add(40);
        tm.add(50);
        
        System.out.println("the value of tree:"+tm);
        
        System.out.println(tm.contains(20));
        System.out.println(tm.remove(10));
        
        System.out.println("the updated value of tree:"+tm);

        
	}
	

}
