package assignment2;

class Student<T> {
	private String name;
	private T rollno;//Integer or String
	private int age;

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollno(T rollno) {
		this.rollno=rollno;
	}
	public T getRollno() {
		return rollno;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}


