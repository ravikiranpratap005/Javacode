package arrayconcept;

import java.util.Scanner;

public class ArrayConcept4
{
	public static void main(String[] args)
	{
		int rollno [] = new int[5];
		for(int i=0; i<rollno.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			rollno[i] = sc.nextInt();
		}
		
		for(int i=0; i<rollno.length; i++)
		{
			if(rollno[i] == 34)
			{
				System.out.println("34 rollno index is : "+ i + ".");
			}
		}
	}
}
