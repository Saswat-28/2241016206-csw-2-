package assignment1;

public class Laptop {
	private String model;
	private int price;
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
@Override
public String toString() {
	return "Model-"+model+" Price-"+price;
}
}
