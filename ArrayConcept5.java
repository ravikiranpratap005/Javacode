package arrayconcept;

import java.util.Arrays;

public class ArrayConcept5
{
	public static void main(String[] args)
	{
		int numbers [] = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		int numbers1 [] = new int [5];
		for(int i=0; i<numbers1.length;  i++)
		{
			numbers1[i] = numbers[i];
		}
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers ));
	}
}
