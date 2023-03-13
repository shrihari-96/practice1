package JavaPractice;

public class InheritenceStudy extends A
{

	public static void main(String[] args)
	{
		InheritenceStudy subclass= new InheritenceStudy();
		
		subclass.Hari();
		subclass.Papa();
		subclass.ajja();
		
		 A upcasting1 = new InheritenceStudy();
		 upcasting1.Papa();
		 upcasting1.ajja();
		 
		 B upcasting2 = new InheritenceStudy();
		 upcasting2.ajja();
	}

	public void Hari()
	{
		System.out.println("I am metod from child/sub class");
	}
	public void money()
	{
		System.out.println(" I am money method from Class A");
	}
}
