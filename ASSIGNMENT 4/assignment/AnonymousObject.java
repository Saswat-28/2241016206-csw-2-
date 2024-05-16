package assignment;

class AnonymousObject {
	String name;
	
	AnonymousObject(String n){
		this.name=n;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(name+ " is garbage collected.");
	}
	public static void main(String[] args) {
		new AnonymousObject("Anonymous Object"); 
		System.gc();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println();
		}
	}
}

