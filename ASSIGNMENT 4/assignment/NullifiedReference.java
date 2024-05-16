package assignment;

class NullifiedReference {
	String name;
	
	NullifiedReference(String n){
		this.name=n;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(name+ " is garbage collected");
	}
	public static void main(String[] args) {
		NullifiedReference ob1= new NullifiedReference("Object1");
		NullifiedReference ob2= new NullifiedReference("Object2");
		ob1=null;
		System.gc();
	}

}
