// Airthmatic Operations
package basics;

public class AirthmaticOperations 
{
	public static void main(String[] args) 
	{
		add();
		sub();
		multi();
		div();
		modules();
	}
	
	static void add()
	{
		int a=10;
		int b=15;
		int c = a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=10;
		int b=15;
		int c = a-b;
		System.out.println(c);
	}
	static void multi()
	{
		int a=10;
		int b=15;
		int c = a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=10;
		int b=15;
		int c = b/a;
		System.out.println(c);
	}
	static void modules()
	{
		int a=10;
		int b=15;
		int c = b%a;
		System.out.println(c);
	}
}
