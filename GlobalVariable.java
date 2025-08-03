// Global variable

package basics;

public class GlobalVariable
{
	
	int a = 100; //Global variable
	static boolean answer = false; //Global variable
	static int b; //initilization of global static variable
	double c; //initilization of global non-static variable
	
	static void add()
	{
		int e = 200; //Local variable
		b = 143; //updating global static variable
	}
	
	void sub()
	{
		int f = 300; //Local variable
		//GlobalVariable ravi = new GlobalVariable();
		//ravi.c = 143.143;
		this.c = 143.143; // for the non-static data type.
		
	}
	
	public static void main(String[] args)
	{
		int d = 300; //Local variable
		System.out.println(b); //utilization
		add();
		System.out.println(b); //utilization after updating the value
		GlobalVariable pratap = new GlobalVariable();
		System.out.println(pratap.c);
		pratap.sub();
		System.out.println(pratap.c);
		
	}
}
