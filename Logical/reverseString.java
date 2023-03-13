package Logical;

public class reverseString 
{

	public static void main(String[] args) 
	{
		String S = "ShriHari";
		String RevString= "";
		
		for (int i=S.length()-1;i>=0;i--)
		{
			RevString= RevString+S.charAt(i);
		}
		System.out.println(RevString);
	}
	
	String s ="Shrihari"; 
	String p = "";
	for(int i=s.length()-1;i>=1;i--) 
	{
		p=p+s.charAt(i);
		System.out.println();
	}

}
