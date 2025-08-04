package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept3
{
	public static void main(String[] args)
	{
		int numbers [] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==34)
			{
				System.out.println("34 is present in array.");
			}
		}
	}
}
