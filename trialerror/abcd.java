package trialerror;
public class abcd {
	int z;
		public abcd()
	 {
		System.out.println("i am in default constructor"); 
	 }
	 public abcd(char h)
	{
		 System.out.println( "i am in default parameterised charactor constructor");
	}
	public abcd(int x)
	{
		z = x;
	 }
	public void display() 
	{
		System.out.println("i am in display method"+z);
	}

}
