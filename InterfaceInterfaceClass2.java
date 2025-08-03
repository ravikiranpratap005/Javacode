// Multiple Level Inheritance using interface
package basics;

interface Flipkart
{
	void login_fp();
}

interface Ajio
{
	void login_aj();
}

public class InterfaceInterfaceClass2 implements Flipkart,Ajio
{

	@Override
	public void login_aj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login_fp() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		
	}

}
