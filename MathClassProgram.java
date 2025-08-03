package basics;

public class MathClassProgram 
{
	 //final static double pi = 3.14;
	final static double pi = Math.PI;
	public static void main(String[] args)
	{
		System.out.println(Math.addExact(1, 2)); // int,int and long,long
		System.out.println(Math.subtractExact(2, 1)); // int,int and long,long
		System.out.println(Math.multiplyExact(2, 3)); // int,int and int,long and long,long
		System.out.println(Math.min(55, 45)); // int,int and float,float and double,double abd long,long
		System.out.println(Math.max(55, 999)); // int,int and float,float and double,double abd long,long
		System.out.println(Math.abs(-100)); // double, float, int, long 
		System.out.println(Math.random()); //double
		
		
		double r = Math.random();
		double area_of_a_circle = pi*r*r;
		System.out.println(area_of_a_circle);
	}
}
