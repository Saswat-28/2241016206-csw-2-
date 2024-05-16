package assignment2.q4;

public class Student implements Comparable<Student> {
	private String name;
	private int rn;
	private int totalMark;
	
	public Student(String name,int rn,int totalMark) {
		this.name=name;
		this.rn=rn;
		this.totalMark=totalMark;
	}
	
	public String getName() {
		return name;
	}
	public int getRn() {
		return rn;
	}
	public int getTotalMark() {
		return totalMark;
	}
	
	@Override
	public String toString() {
		return "Name-"+name+" Roll no-"+rn+" Mark-"+totalMark;
	}
	
	@Override
	public int compareTo(Student s){
		if(rn>this.getRn()) {
			return 1;
		}
		else if(rn<this.getRn()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Student s[]=new Student[3];
		s[0]=new Student("Archit",10,50);
		s[1]=new Student("Ashit",11,60);
		s[2]=new Student("Motu",12,70);
		
		Student x=new Student("Kamala",13,80);
		
		for(int i=0;i<s.length;i++) {
			if((s[i].compareTo(x)==0)) {
				System.out.println("The student "+s[i]);
				break;
			}
		}
	}
}
