package assignment;

class ReassigningReference {
	String name;
	
	ReassigningReference(String n){
		this.name=n;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(name+ " is garbage collected");
	}
	public static void main(String[] args) {
		ReassigningReference ob1= new ReassigningReference("Object1");
		ReassigningReference ob2= new ReassigningReference("Object2");
		ob2=ob1;
		System.gc();
	}

}
