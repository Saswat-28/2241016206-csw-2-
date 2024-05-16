package assignment2p2;

import java.util.*;

public class Q12 {

	public static void main(String[] args) {
		int arr[]= {1,2,10,8,7,3,4,6,5,9};
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
		for(Integer i:arr) {
			pq.add(i);
		}
		System.out.println("Dequeue of elements are: ");
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		}
	}

}
