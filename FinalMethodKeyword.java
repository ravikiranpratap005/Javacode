package basics;

class Amazon2
{
	final void login()
	{
		System.out.println("Login into the Amazon successfully.");
	}
}



public class FinalMethodKeyword extends Amazon2
{
	void login1()
	{
		System.out.println("Login into the Amazon through mobile successfully.");
	}
	
	public static void main(String[] args)
	{
		FinalMethodKeyword fm = new FinalMethodKeyword();
		fm.login();
	}
}
