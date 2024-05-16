package assignment1;

public class Complex {
	int imag;
	int real;

public Complex(int i,int r) {
	imag=i;
	real=r;
}
public void display() {
	System.out.println("imag="+imag+" real="+real);
}
public Complex(Complex C) {
	imag=C.imag;
	real=C.real;
}
public static void main(String[] args) {
	Complex C1=new Complex(10,15);
	C1.display();
	Complex C2=new Complex(C1);
	C2.display();
	Complex C3=C2;
	}
}