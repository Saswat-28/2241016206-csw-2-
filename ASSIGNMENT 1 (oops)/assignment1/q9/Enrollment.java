package assignment1.q9;

public class Enrollment implements EnrollmentSystem{
		Student s=new Student();
		Course c=new Course();
	
@Override
public void dropout() {
		s.setName("Ashit");
		c.setCourseName("Btech");
		System.out.println("Student "+s.getName()+" is dropped out from "+"course "+c.getCourseName());
	}
@Override
public void enroll() {
	s.setName("Archit");
	c.setCourseName("Btech");
	System.out.println("Student "+s.getName()+ " is enrolled "+"in course "+c.getCourseName());
}

	public static void main(String[] args) {
		Enrollment ob=new Enrollment();
		ob.enroll();
		ob.dropout();
	}

}
