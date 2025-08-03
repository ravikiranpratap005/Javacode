// How to call a constructor

package basics;

public class Constructor 
{
	public static void main(String[] args)
	{
		Constructor pratap = new Constructor();
		new Constructor();
		Constructor ravi  = new Constructor(1);
		new Constructor(2);
	}
	Constructor()
	{
		System.out.println("PRATAP");
	}
	Constructor(int a)
	{
		System.out.println(a);
	}
}
