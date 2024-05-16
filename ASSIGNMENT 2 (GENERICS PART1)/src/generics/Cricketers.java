package generics;

public class Cricketers implements Comparable<Cricketers>{
	private String name;
	private int age;
	
	public Cricketers(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public int compareTo(Cricketers ob) {
		if(ob.getAge()<this.age) {
			return 1;
		}
		else if(ob.getAge()>this.age) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Cricketers c1=new Cricketers("Virat",36);
		Cricketers c2=new Cricketers("Rohit",35);
		System.out.println(c1.compareTo(c2));
	}
	
}
