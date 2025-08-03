package basics;
import java.util.Scanner;

public class ScannerMethod 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s1.next();
		System.out.println("What is your age?");
		int age = s1.nextInt(); // Same for the byte,short and long
		System.out.println("What is your salary?");
		double salary = s1.nextDouble(); // Same for the float
		System.out.println("Did you have dinner?");
		boolean dinner = s1.nextBoolean();
	}
}
// System.in --> Accept the request
// System.out --> Give the result