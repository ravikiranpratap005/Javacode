package basics;

abstract class facebook
{
	abstract void facebook_login();
	abstract void facebook_registration();
}

abstract class google extends facebook // Relationship with abstract class and abstract class
{
	abstract void google_login();
	abstract void google_registration();
}

public class Abstarct_Concrete_Class_Relationship extends google
{
	public static void main(String[] args)
	{
		//Logic here I have to written
	}

	@Override
	void google_login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void google_registration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void facebook_login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void facebook_registration() {
		// TODO Auto-generated method stub
		
	}
}
