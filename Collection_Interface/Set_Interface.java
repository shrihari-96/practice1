package Collection_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;


public class Set_Interface 
{

	public static void main(String[] args) 
	{
		HashSet HS = new HashSet();
		
		HS.add("Rahul");      //not allows duplicate values
		HS.add("Nitesh");
		HS.add("Hari");
		HS.add("Rahul");		//not allows duplicate values
		HS.add("Prafull");
		HS.add("Somesh");
		HS.add(null);		//only allows single NULL values
		HS.add(null);
		HS.add(1);
		HS.add(2);
		
		
		ArrayList AL= new ArrayList(HS);
		System.out.println(AL.size());
		System.out.println(AL.get(0));
		System.out.println(AL.get(1));
		System.out.println(AL.get(2));
		System.out.println(AL.get(3));
		System.out.println(AL.get(4));
		System.out.println(AL.get(5));
		System.out.println(AL.get(6));
		System.out.println(AL.get(7));
		
		LinkedHashSet LHS= new LinkedHashSet();
		
		
		LHS.add("Rahul");      //not allows duplicate values
		LHS.add("Nitesh");
		LHS.add("Hari");
		LHS.add("Rahul");		//not allows duplicate values
		LHS.add("Prafull");
		LHS.add("Somesh");
		LHS.add(null);		//only allows single NULL values
		LHS.add(null);
		LHS.add(1);
		LHS.add(2);
		
		ArrayList ARL= new ArrayList(LHS);
		System.out.println("===================");
		System.out.println(ARL.size());
		System.out.println(ARL.get(0));
		System.out.println(ARL.get(1));
		System.out.println(ARL.get(2));
		System.out.println(ARL.get(3));
		System.out.println(ARL.get(4));
		System.out.println(ARL.get(5));
		System.out.println(ARL.get(6));
		System.out.println(ARL.get(7));
		
		
		
		TreeSet TS=  new TreeSet();
		TS.add("Rahul");      //not allows duplicate values    
		TS.add("Nitesh");
		TS.add("Hari");
		TS.add("Rahul");		//not allows duplicate values 
		TS.add("Prafull");
		TS.add("Somesh");
//		TS.add(null);		//only allows single NULL values  
//		TS.add(null);
		TS.add("xyz");
		TS.add("xyz");
		
		ArrayList ARLI= new ArrayList(TS);
		System.out.println("===================");
		System.out.println(ARLI.size());
		System.out.println(ARLI.get(0));
		System.out.println(ARLI.get(1));    
		System.out.println(ARLI.get(2));
		System.out.println(ARLI.get(3));
		System.out.println(ARLI.get(4));
		System.out.println(ARLI.get(5));
//		System.out.println(ARLI.get(6));
//		System.out.println(ARLI.get(7));

		
		
	}

}
