package hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		HashMap<String, Integer> ob = new HashMap<String, Integer>();
		 ob.put("A",14);
		 ob.put("B",33);
		 ob.put("C",16);
		 ob.put("D",17);
		 ob.put("E",19);
		 Set set1 = ob.entrySet();
		 Iterator iterator1 = set1.iterator();
		 while (iterator1.hasNext()) {
		 Map.Entry ment1 = (Map.Entry) iterator1.next();
		 System.out.println("The value is " + ment1.getValue() + " and key is: " +ment1.getKey());
	}
		 Integer va = ob.get(2);
		 System.out.println("Index 2 has value of " + va);
		 ob.remove("C");
		 Set set2 = ob.entrySet();
		 Iterator iterator2 = set2.iterator();
		 while (iterator2.hasNext()) {
		 Map.Entry ment2 = (Map.Entry) iterator2.next();
		 System.out.println("Now value is " + ment2.getValue() + " and key is: " +ment2.getKey());
		 }
	}
} 
