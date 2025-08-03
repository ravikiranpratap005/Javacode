package basics;

public class OverloadMain 
{
	public static void main()
	{
		System.out.println("1");
	}
	public static void main(String name)
	{
		System.out.println("2");
	}
	public static void main(int a)
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		main();
		main("Ravi");
		main(1);
		
	}
}
