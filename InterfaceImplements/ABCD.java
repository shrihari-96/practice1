package InterfaceImplements;

public interface ABCD

{
	int a=10;
	
	void A();
	void B();
	
	default void C()
	{
		System.out.println("i m in ABCD"); 
	}
	
}
