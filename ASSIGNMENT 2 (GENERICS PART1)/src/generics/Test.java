package generics;

class Test<T> {
	T obj;
	
	Test(T obj){
		this.obj=obj;
	}

	public T getObject() {
		return obj;
	}

	public static void main(String[] args) {
		Test<Integer> ob=new Test<Integer>(10);
		System.out.println(ob.getObject());
		
		Test<String> s=new Test<String>("Archit");
		System.out.println(s.getObject());
	}
	
}