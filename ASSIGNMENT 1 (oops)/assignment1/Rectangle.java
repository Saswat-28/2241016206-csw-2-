package assignment1;

public class Rectangle {
	private int length;
	private int width;
	private int Area;
	private int Perimeter;
	
	public Rectangle(int l,int w) {
		this.length=l;
		this.width=w;
	}
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	
	public int Area() {
		return Area = length*width;
	}
	
	public int Perimeter() {
		return Perimeter=2*(length+width);
	}
	
	public static void main(String[] args) {
		Rectangle ob=new Rectangle(5,4);
		System.out.println("Area="+ob.Area());
		System.out.println("Perimeter="+ob.Perimeter());
	}

}
