package assignment2p2;
import java.util.*;

public class CarApp {
	
	public static void main(String[] args) {
		 ArrayList<Car> cars = new ArrayList<Car>();
	        
	        cars.add(new Car(2013, "Creta", 10));
	        cars.add(new Car(2020, "MG", 13));
	        cars.add(new Car(2018, "Kia", 20));
	        cars.add(new Car(2017, "Audi", 45));
	        cars.add(new Car(2015, "BMW", 55));
	        
	        Collections.sort(cars);
	        
	        System.out.println("Sorted Car List: ");
	        System.out.println(cars.toString());
	}

}
