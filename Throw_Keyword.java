package basics;

import java.util.InputMismatchException;

public class Throw_Keyword 
{
	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if(1==12)
		{
			throw new NullPointerException("Number is correct.");
		}
		else
		{
			throw new InputMismatchException("Number is wrong.");
		}
	}
}
