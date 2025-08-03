package basics;

public class FinallyKeyword 
{
	public static void main(String[] args)
	{
		try
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("handle the exception.");
		}
		finally
		{
			System.out.println("Welcome Pratap!");
		}
	}
}
