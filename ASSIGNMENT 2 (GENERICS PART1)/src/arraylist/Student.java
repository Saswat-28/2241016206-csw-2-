package arraylist;
import java.util.*;

public class Student {
	private String name;
	private int reg;
	private int mark;
	
	public Student(String name,int reg,int mark) {
		this.name=name;
		this.reg=reg;
		this.mark=mark;
	}
	
	public String getName() {
		return name;
	}
	public int getReg() {
		return reg;
	}
	public int getMark() {
		return mark;
	}
	
	public static void main(String[] args) {
		ArrayList<Student>ob=new ArrayList<Student>();
		Student S[]=new Student[3];
		S[0]=new Student("Archit",115840,54);
		S[1]=new Student("Ashit",122691,36);
		S[2]=new Student("Motu",154482,15);
		ob.add(S[0]);
		ob.add(S[1]);
		ob.add(S[2]);
		
		//Iterator
		Iterator itr=ob.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println("Name of the student-"+st.name);
			System.out.println("Registration number-"+st.reg);
			System.out.println("Marks-"+st.mark);
			System.out.println();
		}
		
		//advance for loop
		for(Student st:ob) {
			System.out.println("Name of the student-"+st.name);
			System.out.println("Registration number-"+st.reg);
			System.out.println("Marks-"+st.mark);
			System.out.println();
		}
		
		//normal for loop
		for(int i=0;i<ob.size();i++) {
		System.out.println("Name of the student-"+ob.get(i).name);
		System.out.println("Registration number-"+ob.get(i).reg);
		System.out.println("Marks-"+ob.get(i).mark);
		System.out.println();
		}
	}
}
