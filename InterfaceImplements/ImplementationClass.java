package InterfaceImplements;

public class ImplementationClass implements ABCD,EFGH {

	public static void main(String[] args) 
	{
		ImplementationClass IC = new ImplementationClass();
		
		IC.A();
		IC.B();
		IC.C();
		
		

	}

	@Override
	public void A() 
	{
		System.out.println("Overrided A Method");
	
	}

	@Override
	public void B() 
	{
		System.out.println("Overrided B Method");
		
			}

	@Override
	public void C() 
	{
		EFGH.super.C();
		ABCD.super.C();
		
	}

}
