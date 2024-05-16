package assignment1.LibrarySystemAssignment;

class DVD extends LibraryResource{
	private int duration;
	
	public DVD(String title,String author,int duration) {
		super(title,author);
		this.duration=duration;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	
@Override
public void displayDetails() {
	System.out.println("DVD title: "+getTitle());
	System.out.println("Author: "+getAuthor());
	System.out.println("Duration: "+getDuration());
}
}
