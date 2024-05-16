package assignment1;

public class Point {
	int X;
	int Y;
	
public Point(int x,int y) {
	this.X=x;
	this.Y=y;
}

public Point(Point other) {
	this.X=other.Y;
	this.Y=other.Y;
}

public void setX(int X) {
	this.X=X;
}
public int getX() {
	return X;
}

public void setY(int Y) {
	this.Y=Y;
}
public int getY() {
	return Y;
}

public static void main(String[] args) {
		Point P1=new Point(1,2);
		Point P2=new Point(P1);
		
		System.out.println("Point1: ("+P1.getX()+","+P1.getY()+")");
		System.out.println("Point after modification:");
		P2.setX(3);
		P2.setY(4);
		System.out.println("Point2: ("+P2.getX()+","+P2.getY()+")");
	}
}
