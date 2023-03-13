package InterfaceImplements;

public interface EFGH 
{
	int a = 100 ;
	void A();
	void B();
	
	default void C()
	{
		System.out.println("I am EFGH");
	}
}
