package assignment2p2;

public class Car implements Comparable<Car> {
	private int ModalNo;
	private String name;
	private int stock;
	
	public Car(int ModalNo,String name,int stock) {
		this.ModalNo=ModalNo;
		this.name=name;
		this.stock=stock;
	}
	@Override
    public String toString() {
        return ModalNo + " " + name + " " + stock;
    }
	@Override
	public int compareTo(Car o) {
		if(this.stock>o.stock) {
			return 1;
		}
		else if(this.stock<o.stock) {
			return -1;
		}
		else 
			return 0;
    }
}

