package interfaceimplementHB;

public class child_imlements implements mother_interface,father_interface {

	public static void main(String[] args) 
	{
		System.out.println(mother_interface.A);
		child_imlements ci = new child_imlements();
		
	    ci.abc();
	    pqrs(12);
	// ***if you want to call a static method in the static, non static or in main method then you follow two syntax
	// for calling from another class then ......1) classname.methodname();
	// for calling from same class then .........2) methodname();
	// *** if you want to call a non static method in the static, non static or in main method then you follow two syntax   
	// creating a object of that class.. you want to call non static method of that class
	// like this class cl = new class ();
	//                 cl.nonstaticmethodname();
	}
	
	
	

	@Override
	public void abc()
	{
		child_imlements ci = new child_imlements();
		System.out.println(father_interface.A);
        
	}

	@Override
	public void pqr()
	{
		
	}

	@Override
	public void xyz()
	{
		
	}
		
   public static void pqrs(int d )
   {
	   System.out.println(d);
   }
}
