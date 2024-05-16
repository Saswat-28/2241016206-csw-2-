package assignment1.q5;

public class Student {
	private int studentId;
	private String studentName;
	College C;
	public Student(int studentId, String studentName,College C) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.C=C;
	}
	void displayStudent() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(C.collegeName);
		System.out.println(C.collegeLoc);
	}
}
