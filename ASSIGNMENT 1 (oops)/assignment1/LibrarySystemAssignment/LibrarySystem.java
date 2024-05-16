package assignment1.LibrarySystemAssignment;

public class LibrarySystem {

	public static void main(String[] args) {
		LibraryResource book=new Book("Marvel","Stan Lee",500);
		LibraryResource magazine=new Magazine("Vogue","Mark","February 2024");
		LibraryResource dvd=new DVD("Solo Leveling","Sung Jinwoo",180);
		
		book.displayDetails();
		System.out.println();
		magazine.displayDetails();
		System.out.println();
		dvd.displayDetails();
	}

}
