package assignment;

class UnreachableObject {
	String name;
	
	UnreachableObject(String s){
		this.name=s;
	}
	
	void display() {
		System.out.println(name+" is garbage created");
	}
	
	void show() {
		UnreachableObject obj2 = new UnreachableObject("Object2");
        obj2.display();
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(name+ " is garbage collected");
	}
	public static void main(String[] args) {
		UnreachableObject obj1 = new UnreachableObject("Object1");
        obj1.show();
        System.gc();
	}

}
