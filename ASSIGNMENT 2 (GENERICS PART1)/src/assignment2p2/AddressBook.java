package assignment2p2;
import java.util.*;

class Address{
	private String plotno;
	private String at;
	private String post;
	
	public Address(String plotno, String at, String post) {
		this.plotno=plotno;
		this.at=at;
		this.post=post;
	}
	@Override
    public String toString() {
        return "Plot No: " + plotno + ", Street: " + at + ", City: " + post;
    }
}
public class AddressBook {

	public static void main(String[] args) {
		 TreeMap<String, Address> addressBook = new TreeMap<>();
	        addressBook.put("Archit", new Address("123", "5th", "Unit-6"));
	        addressBook.put("Ashit", new Address("456", "6th", "Nayapalli"));
	        addressBook.put("Motu", new Address("789", "7th", "Raghunathpur"));
	        
	        Iterator<Map.Entry<String, Address>> iterator = addressBook.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<String, Address> entry = iterator.next();
	            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
	        }
	    
	}

}
