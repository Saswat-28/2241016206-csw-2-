package assignment1.LibrarySystemAssignment;

class Magazine extends LibraryResource {
	private String issueDate;
	
	public Magazine(String title,String author,String issueDate) {
		super(title,author);
		this.issueDate=issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate=issueDate;
	}
	public String getIssueDate() {
		return issueDate;
	}

@Override
public void displayDetails() {
	System.out.println("Magazine Title: "+getTitle());
	System.out.println("Author: "+getAuthor());
	System.out.println("Issue Date: "+getIssueDate());
}
}
