package assignment2;

public class Driver {

	public static void main(String[] args) {
		Student<String> n=new Student<String>();
		n.setName("Archit");
		System.out.println("Name- "+n.getName());
		Student<Integer> ob=new Student<Integer>();
		ob.setRollno(10);
		System.out.println("Roll no- "+ob.getRollno());
		Student<String> ob1=new Student<String>();
		ob1.setRollno("2241002067");
		System.out.println("Roll no- "+ob1.getRollno());
		Student<Integer> a=new Student<Integer>();
		a.setRollno(20);
		System.out.println("Age- "+a.getRollno());
	}

}
