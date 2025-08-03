package basics;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter 1 to 4 any number :");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Launch Chrome 1.");
			break;
		case 2:
			System.out.println("Launch Chrome 2.");
			break;
		case 3:
			System.out.println("Launch Chrome 3.");
			break;
		case 4:
			System.out.println("Launch Chrome 4.");
			break;
		default:
			System.out.println("Sorry your selection is wrong. Please select again.");
		}
		
	}
}
