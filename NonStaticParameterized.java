// Calling the non static with parameterized method in main body

package basics;

public class NonStaticParameterized 
{
	public static void main(String[] args) 
	{
		NonStaticParameterized pratap = new NonStaticParameterized();
		pratap.add(2, 3);
		pratap.login("pratap", "paratp");
		
		NonStaticParameterized ravi = new NonStaticParameterized();
		ravi.sub(2, 4.87568585);
		
	}
	
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	void login (String username, String password)
	{
		System.out.println("Logined successfully.");
	}
	
	void sub(int a, double b)
	{
		double sub = b-a;
		System.out.println(sub);
	}
}
