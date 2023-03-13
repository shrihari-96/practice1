package Logical;

public class ReverseNumberUsingString 
{

	public static void main(String[] args) 
	{
		int xyz= 123;
		
		String S= Integer.toString(xyz);
		String RevString="";
		// S= "123"
		for(int i = S.length()-1;i>=0;i--)
		{
			RevString= RevString+S.charAt(i);
		}
		
		System.out.println(RevString);   // string format
		
		int ReverseNumber = Integer.parseInt(RevString);
		
		System.out.println(ReverseNumber);
	}

}
