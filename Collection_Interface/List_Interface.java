package Collection_Interface;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class List_Interface 
{

	public static void main(String[] args) 
	{
		ArrayList AL= new ArrayList();
		
		ArrayList<Character> ALY= new ArrayList<Character>();
		
		ALY.add('A');
		
		AL.add("Rahul");      //allows duplicate values
		AL.add("Nitesh");
		AL.add("Hari");
		AL.add("Rahul");		//allows duplicate values
		AL.add("Prafull");
		AL.add("Somesh");
		AL.add(null);		//allows NULL values
		AL.add(null);		//allows NULL values
		
		System.out.println(AL.size());
		System.out.println(AL.get(0));
		System.out.println(AL.get(1));
		System.out.println(AL.get(2));
		System.out.println(AL.get(3));
		System.out.println(AL.get(4));
		System.out.println(AL.get(5));
		System.out.println(AL.get(6));
		System.out.println(AL.get(7));
		System.out.println("==============");
		
		
		Vector Ve= new Vector();
		
		Ve.add("Rahul");      //allows duplicate values
		Ve.add("Nitesh");
		Ve.add("Hari");
		Ve.add("Rahul");		//allows duplicate values
		Ve.add("Prafull");
		Ve.add("Somesh");
		Ve.add(null);		//allows NULL values
		Ve.add(null);		//allows NULL values
		
		
		System.out.println(Ve.get(0));
		System.out.println(Ve.get(1));
		System.out.println(Ve.get(2));
		System.out.println(Ve.get(3));
		System.out.println(Ve.get(4));
		System.out.println(Ve.get(5));
		System.out.println(Ve.get(6));
		System.out.println(Ve.get(7));
		System.out.println("===============");
		
		
		LinkedList LL= new LinkedList();
		
		LL.add("Rahul");      //allows duplicate values
		LL.add("Nitesh");
		LL.add("Hari");
		LL.add("Rahul");		//allows duplicate values
		LL.add("Prafull");
		LL.add("Somesh");
		LL.add(null);		//allows NULL values
		LL.add(null);		//allows NULL values
		
		System.out.println(LL.get(0));
		System.out.println(LL.get(1));
		System.out.println(LL.get(2));
		System.out.println(LL.get(3));
		System.out.println(LL.get(4));
		System.out.println(LL.get(5));
		System.out.println(LL.get(6));
		System.out.println(LL.get(7));
		System.out.println("=================");
		LL.remove(3);
		System.out.println(LL.get(3));
		
		Iterator iter = Ve.iterator();
		System.out.println("========tsdghs============");
		if (iter.hasNext())
		{
			for (int i=0; iter.hasNext(); i++)
			{
			System.out.println(iter.next());
			}
		}
		
		ListIterator listIter = Ve.listIterator();
		
		System.out.println("=====next===========");
		if (listIter.hasNext())
		{
			for (int i=0; listIter.hasNext(); i++)
			{
			System.out.println(listIter.next());
			}
			System.out.println("=====previous===========");
			for (int i=0; listIter.hasPrevious(); i++)
			{
			System.out.println(listIter.previous());
			}
		}
	
		
			
		
		Enumeration enumer = Ve.elements();
		
		System.out.println("======enumeration========");
		if (enumer.hasMoreElements())
		{
			for (int i=0; enumer.hasMoreElements(); i++)
			{
			System.out.println(enumer.nextElement());
			}
		}
		
		System.out.println("=====for loop======");
		for (int i=0; i<Ve.size();i++)
		{
			System.out.println(Ve.get(i));
		}
		
		System.out.println("=====for each loop======");
		for (Object xyz:Ve)
		{
			System.out.println(xyz);
		}
	}

}
