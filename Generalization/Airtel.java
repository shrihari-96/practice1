package Generalization;

public class Airtel implements TRAI{

	public static void main(String[] args) 
	{
		Airtel A= new Airtel();
		A.Calls();
		A.Message();
		A.InternetData();
				
	}

	@Override
	public void Calls()
	{
		System.out.println("I am Airtel Calls, set my rate");		
	}

	@Override
	public void Message() 
	{
		System.out.println("I am Airtel Message, set my rate");			
	}

	@Override
	public void InternetData() 
	{
		System.out.println("I am Airtel Data, set my rate");			
	}

}
