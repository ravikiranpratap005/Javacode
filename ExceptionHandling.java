package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

class A
{
	static int b = 10;
}

class B extends A
{
	static int c = 100;
}

public class ExceptionHandling extends B
{
	public static void main(String[] args)
	{
		try
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("We can not use this .");
		}
		int a1 = b/c; //b form parent class and c comes super most class is possible.
		
		try
		{
			Scanner sc =new Scanner(System.in);
			System.out.print("Please enter the age : ");
			int age = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a integert.");
		}
		
	}
}
