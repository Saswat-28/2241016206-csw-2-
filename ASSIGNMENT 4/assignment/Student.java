package assignment;
import java.util.*;
class Student {
	private String name;
	private int mark;
	
	public Student(String name,int  mark) {
		this.name=name;
		this.mark=mark;
	}
	private static void memory() {
		long x=Runtime.getRuntime().totalMemory();
		System.out.println("Total memory " +x);
		long y=Runtime.getRuntime().freeMemory();
		System.out.println("Free memory " +y);
		long TM=x-y;
		System.out.println("Memory used is "+TM );
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage is succcessful for name " + this.name);
		System.out.println("Garbage is succcessful for mark " + this.mark);

	} 
	public static void main(String[] args) {
		Student s1=new Student("Archit",75);
		Student s2=new Student("Ashit",36);
		memory();
		s1=s2;
		System.gc();
		memory();
	}

}
