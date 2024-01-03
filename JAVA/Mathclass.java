import java.lang.Math;
public class  Mathclass
{
	public static void main(String args[])
	{
		double x = 23;
		double y  =45;

		double a = Math.random();
		double b = Math.random()*34;
		System.out.println("Maximum number of  x and y is :" + Math.max(x,y));
		System.out.println("Minimum number of  x and y is :" + Math.min(x,y));
		System.out.println("Squareroot  y is :" + Math.sqrt(y));
		System.out.println("Power of  x and y is :" + Math.pow(x,y));
		System.out.println("Absolute value of (-6556.4546):" + Math.abs(-6556.4546));
		System.out.println("Random number a is :" + a);
		System.out.println("Random number b is :" + b);
		System.out.println("Round number b is :" + Math.round(b));

		
	}

}