package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept6
{
	public static void main(String[] args)
	{
		int a1[] = new int[5];
		int b1[] = new int[5];
		int l = a1.length;
		int b = b1.length;
		for(int i=0; i<l; i++)
		{
			Scanner sc = new Scanner(System.in);
			a1[i] = sc.nextInt();
		}
		
		for (int i=0,j=4; i<5 && j>=0; i++,j--)
		{
			b1[j] = a1[i];
		}
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
	}
}
