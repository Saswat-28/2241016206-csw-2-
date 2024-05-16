package assignment;

public class Example {
	private int data1;
	private double data2;
	
	Example(int data1, double data2){
		this.data1=data1;
		this.data2=data2;
	}
	public void set(int data1, double data2) {
		this.data1=data1;
		this.data2=data2;
	}

	public static void main(String[] args) {
		Example ob1=new Example(5,10.0);
		Example ob2=new Example(15,20.0);
		
		Runtime runtime=Runtime.getRuntime();
        long memoryBefore=runtime.totalMemory()-runtime.freeMemory();
        ob1=null;
        ob2=null;
        System.gc();
        long memoryAfter=runtime.totalMemory()-runtime.freeMemory();

        System.out.println("Memory occupied: " + (memoryBefore - memoryAfter) + " bytes");
        System.out.println("Total memory: " + runtime.totalMemory() + " bytes");
	}

}