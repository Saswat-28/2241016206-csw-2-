package assignment1.q8;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.accelerate();
        bicycle.accelerate();

        car.accelerate(60);
        car.accelerate(60, 5);

        bicycle.accelerate(15);
        bicycle.accelerate(15, 10);

        car.brake();
        bicycle.brake();
    }
}


