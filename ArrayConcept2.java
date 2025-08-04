package arrayconcept;

import java.util.Arrays;

public class ArrayConcept2 
{
	public static void main(String[] args)
	{
	int s1[] = new int[1];
	s1[0] = 45;
	int s2[] = new int[1];
	s2[0] = 45;
	
	boolean A = Arrays.equals(s2, s1);
	System.out.println(A);
	}
}
