// Create a non static method and call in main method
package basics;

public class NonStaticMethod 
{
	public static void main(String[] args) 
	{
		NonStaticMethod pratap = new NonStaticMethod();
		pratap.add();
		pratap.sub();
		
	}
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a = 10;
		int b = 20;
		int c = a-b;
		System.out.println(c);
	}
	
}
