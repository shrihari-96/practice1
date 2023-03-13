package PolymorphismStudy;

public class CompileTimePoly extends A{

	public static void main(String[] args) 
	{
		xyz(13,"hb");
		
		CompileTimePoly AClass= new CompileTimePoly();
         AClass.abc();
		
		A xyzClass = new A();
		xyzClass.abc();
	}

	public static void xyz(int a, int b)	//declaration (name=xyz()), xyz(int a, int b is arguement/parameters)
	{									//body,definition,scope  starting
		
	}									//body,definition,scope  ending
	
	public static void xyz(int x, String y)
	{
     
	}
	
	public static void xyz()
	{
		
	}
	
	public void abc()
	{
		System.out.println("NT");
	}
}
