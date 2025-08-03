// Logical Operators
package basics;

public class LogicalOperartors 
{
	public static void main(String[] args) 
	{
		int a = 18;
		int b = 15;
		
		// AND operator
		if (a==12 && b==15)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		// OR operator
		if(a==12 || b==15)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		// NOT operator
		if(a != 12)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		// AND with NOT operator
		if (!(a==12 && b==15))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		// OR with NOT operator
		if(!(a==12 || b==15))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		 
	}
}
