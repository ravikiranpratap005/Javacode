package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("NullPointException");
		}
		catch(ClassCastException e)
		{
			System.out.println("NullPointException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("NullPointException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatch");
		}
	}
}
