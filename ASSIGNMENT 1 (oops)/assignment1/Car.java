package assignment1;

public class Car {
	private String make;
	private String model;
	public Car(String m1,String m2)
	{
		make=m1;
		model=m2;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}	
}
