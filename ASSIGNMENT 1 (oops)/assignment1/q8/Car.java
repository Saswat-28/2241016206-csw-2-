package assignment1.q8;

class Car implements Vehicle {
	
@Override
public void accelerate() {
	System.out.println("Car is accelerating.");
}
public void accelerate(int speed) {
    System.out.println("Car is accelerating at " + speed + " mph.");
}

public void accelerate(int speed, int duration) {
    System.out.println("Car is accelerating at " + speed + " mph for " + duration + " seconds.");
}

@Override
public void brake() {
    System.out.println("Car is braking.");
}
}
