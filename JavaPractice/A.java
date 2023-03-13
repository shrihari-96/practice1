package JavaPractice;

public class A extends B {

	public static void main(String[] args) 
	{
		A superclass= new A();
		
		superclass.Papa();
		superclass.ajja();

	}

	
	
	public void Papa()
	{
		System.out.println(" I am papa method from Class A");
	}
	
	public void money()
	{
		System.out.println(" I am money method from Class A");
	}
}
