// Conditional Statements
package basics;

public class ConditionalStatements 
{
	public static void main(String[] args) 
	{		
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is lesser than b.");
		}
		
		if(a>b) {
			System.out.println("a is lesser than b.");
		}
		else
		{
			System.out.println("b is greater than a.");
		}
		
		int c = 30;
		if(a>b) 
		{
			System.out.println("a is lesser than b.");
		}
		else if (b>c) 
		{
			System.out.println("b is lesser than c.");
		}
		else
		{
			System.out.println("a,b is lesser than c.");
		}
		
		if(a<b) 
		{
			if(b<c) 
			{
				System.out.println("a and b is lesser than c.");
			}
			else
			{
				System.out.println("c is lesser than b.");
			}
		}
		else
		{
			System.out.println("b is lesser than a.");
		}
	}
}
