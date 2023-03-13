package PolymorphismStudy;

import trialerror.ajoba;

// this program is inheritance example program

public class son extends Father 
{ 
    int Z = 30 ;
	public static void main(String[] args) 
{
		son sn = new son (); 
        aa();      // you can call the static method like this ---aa();
        cc();      // you can call the static method like this ---cc();
        ee();      // you can call the static method like this ---ee();
        sn.bb();   //  you can call the non static method like this ---sn.bb(); 
        sn.dd();   //  you can call the non static method like this ---sn.dd();
        sn.ff();   //  you can call the non static method like this ---sn.ff();
       // ajoba aj = new ajoba ();
       // aj.m1();
       // ajoba.ex();
}
	 public static void ee ()
	    {
	    	System.out.println("i m in ee static method ");
	    }
	    public void ff ()
	    {
	    	System.out.println("i m in ff non static method ");
	    	System.out.println(super.X);// you can call the variables like this super.x(for father or Gfather)
	    	System.out.println(super.Y);// you can call the variables like this super.x(for father or Gfather)
	    	System.out.println(this.Z);// you can call the variables like this this.x(for present or same class)
	    	//System.out.println(this.X); you can also call like this for father or Gfather
	    	//System.out.println(this.Y); you can also call like this for father or Gfather
	    }
	}

