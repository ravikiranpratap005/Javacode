// Who is present in package explorer that is child class.
package basics;

class Class1
{
	void add()
	{
		System.out.println("b");
	}
}

public class MethodOverriding extends Class1
{
	void add()
	{
		super.add();  // super keyword control the parent method.
		System.out.println("a");
		super.add();
	}
	
	
	public static void main(String[] args)
	{
		MethodOverriding a1 = new MethodOverriding();
		a1.add();	
	}
}
