// Calling static method with parameterized

package basics;

public class StaticParameterized 
{
	public static void main(String[] args) 
	{
		add(1,1);
		addition(2,4);
		login("pratap","pratap");
		sub(2,4);
	}
	
	static void add(int a, int b)
	{
		System.out.println("Addtion");
	}
	
	static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void sub(int a, int b)
	{
		int c = a;
		int d = b;
		int sub = d-c;
		System.out.println(sub);
	}
	
	static void login(String username, String password)
	{
		System.out.println("Login into application successfully.");
	}
}
