package basics;

interface Google1
{
	void google_login();
}
interface Facebook1 extends Google1
{
	void facebook_login();
}

public class InterfaceInterfaceClass1 implements Facebook1
{

	@Override
	public void google_login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void facebook_login() {
		// TODO Auto-generated method stub
		
	}
	
}
