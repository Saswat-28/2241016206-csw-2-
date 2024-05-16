package linklist;
import java.util.LinkedList;
import java.util.*;

public class Student {
	private String name;
    private int age; 
    private int totalMarks;
    public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setmarks(int marks) {
		this.totalMarks=marks;
	}
	public int getmarks() {
		return totalMarks;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student c=(Student)o;
			if(c.getname()==this.getname()&&c.getage()==this.getage()&&c.getmarks()==this.getmarks()) {
				return true;
			}
			else 
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedList<Student>obj=new LinkedList<Student>();
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setname("A");
		s1.setage(20);
		s1.setmarks(56);
		s2.setname("A");
		s2.setage(20);
		s2.setmarks(56);
		s3.setname("C");
		s3.setage(22);
		s3.setmarks(89);
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		
		for(Student i:obj) {
			System.out.println(i.getname()+" "+i.getage()+" "+i.getmarks());
		}
		System.out.println("No. of objects present: "+obj.size());
		System.out.print("Enter the index to remove:");
		int x=sc.nextInt();
		System.out.println(obj.remove(x));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("No. of objects present: "+obj.size());
		for(Student i:obj) {
			System.out.println(i.getname()+" "+i.getage()+" "+i.getmarks());
		}
		
		System.out.println(obj.contains(s1));

	}

}
