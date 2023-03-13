package ThisSuper;

public class InheritenceStudy extends A
{
	int xyas=16;
	public static void main(String[] args)
	{
	 InheritenceStudy xyz= new InheritenceStudy();
	xyz.NT();
	 
	}

	public void NT()
	{
		System.out.println("I am super value "+ super.xyas);	
		System.out.println("I am this value " + this.xyas);
	}
	
}
