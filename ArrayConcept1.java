package arrayconcept;

import java.util.Scanner;

public class ArrayConcept1 
{
	public static void main(String[] args)
	{
		int empployee_id [] = new int[4]; // Array declaration
		empployee_id[0] = 5489; // Array initilization
		empployee_id[1] = 5490;
		empployee_id[2] = 5491;
		empployee_id[3] = 5492;
		System.out.println(empployee_id[1]); // single value print
		
		for (int i=0; i<empployee_id.length; i++)
		{
			System.out.println(empployee_id[i]); // for multiple values
		}
		
		String names [] = new String[4];
		names[0] = "Pratap";
		names[1] = "Ravi";
		names[2] = "Kiran";
		names[3] = "Bargavi";
		
		for (int i=0; i<names.length; i++)
		{
			System.out.println(names[i]); // for multiple values
		}
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println("Name is : "+ names[i] + ". Employee id is : "+empployee_id[i]+ ".");
		}
		
		int name[] = new int[3];
		for (int i=0; i<name.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name["+ i + "] : ");
			name[i] = sc.nextInt();
		}
	}
}
