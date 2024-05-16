package assignment;
import java.util.*;
public class Q11 {
	public static double calculateFunction(double x) throws Exception{
		int X=(int)Math.toDegrees(x);
		int sinX=(int)Math.sin(X);
		int cosX=(int)Math.cos(X);
		int tanX=(int)Math.tan(X);System.out.println(tanX);
		int cotX=(int)(1.0/Math.tan(x));
		
		if(tanX==cotX) {
			throw new Exception("Division by zero error: tan(x) and cot(x) are equal");
		}
		
		double numerator=Math.log(sinX+cotX);
		double denominator=tanX-cotX;
		
		if(Double.isNaN(numerator) || Double.isFinite(numerator)|| numerator<=0){
			throw new Exception("Invalid input: log(sin(x)+cos(x) is not defined for non-positive values");
		}
		
		if(denominator==0) {
			throw new Exception("Division by zero error: denominator is zero");
		}
		return numerator/denominator;
		
	}
	public static void main(String[] args) {
		double x=Math.PI/4;
		try {
			double result=calculateFunction(x);
			System.out.println("Result: "+result);
		}
		catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}

}
