package basics;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		MethodOverloading pratap = new MethodOverloading();
		pratap.add(2);
		pratap.add(2, 3);
	}
	
	void add(int a)
	{
		if (a>5)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
