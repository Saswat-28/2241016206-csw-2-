package assignment1;

public class CarTester {

	public static void main(String[] args) {
		Car myCar1=new Car("Make-German","Model-Virtus");
		Car myCar2=new Car(null,null);
		myCar2.setMake("Make-Italian");
		myCar2.setModel("Model-Lamborghini");
		
		System.out.println("Car1:");
		System.out.println(myCar1.getMake());
		System.out.println(myCar1.getModel());
		
		System.out.println("Car2:");
		System.out.println(myCar2.getMake());
		System.out.println(myCar2.getModel());
	}

}
