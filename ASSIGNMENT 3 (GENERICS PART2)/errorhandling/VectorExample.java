package errorhandling;
	import java.util.*;
	public class VectorExample {
	 public static void main(String[] args) {

	 Vector<Number> vec = new Vector<Number>(3, 2);
	 System.out.println("Initial size is: " + vec.size());
	 System.out.println("Initial capacity is: " + vec.capacity());
	
	 vec.addElement(new Integer(1));
	 vec.addElement(new Integer(2));
	 vec.addElement(new Integer(3));
	 vec.addElement(new Integer(4));
	 System.out.println("The capacity after four additions is: " + vec.capacity());
	 vec.addElement(new Double(6.55));
	 System.out.println("Now capacity is: " + vec.capacity());
	 vec.addElement(new Double(5.35));
	 vec.addElement(new Integer(8));
	 System.out.println("Now capacity is: " + vec.capacity());
	 vec.addElement(new Float(9.5));
	 vec.addElement(new Integer(10));
	 System.out.println("Now capacity is: " + vec.capacity());
	 vec.addElement(new Integer(11));
	 vec.addElement(new Integer(12));
	 System.out.println("First element is: " + (Integer) vec.firstElement());
	 System.out.println("Last element is: " + (Integer) vec.lastElement());
	 if (vec.contains(new Integer(3))) {
	 System.out.println("Vector contains 3.");
	 }

	 Enumeration vecEnum = vec.elements();
	 System.out.println("\nElements in the vector:");
	 while (vecEnum.hasMoreElements()){
	 System.out.print(vecEnum.nextElement() + "");
	 }
	 System.out.println();
	 }
	} 

