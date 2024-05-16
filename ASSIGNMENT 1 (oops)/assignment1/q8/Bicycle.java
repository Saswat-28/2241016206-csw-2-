package assignment1.q8;

public class Bicycle implements Vehicle{
	
	@Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at " + speed + " mph.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at " + speed + " mph for " + duration + " seconds.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

}
