package assignment2p2;
import java.util.*;

public class Library {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Book>HM=new HashMap<Integer,Book>();
		Book B1=new Book(1, "Marvel", "Stan Lee",10);
		Book B2=new Book(2, "Dragon Ball Z", "Akira Toriyama", 20);
		
		HM.put(121, B1);
		HM.put(201, B2);
		
		for(Map.Entry<Integer, Book> em:HM.entrySet()) {
			Integer K=em.getKey();
			Book b=em.getValue();
			System.out.println("Key- "+K);
			System.out.println("Book name- "+b.name+
					" Book ID- "+b.id+
					" Author- "+b.author+
					" Quantity- "+b.quantity);
		}
	}
}
