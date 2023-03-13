package Logical;

public class Palindrome {

	public static void main(String[] args) 
	{
		String S = "Nitin";
		String RevString= "";
		
		for (int i=S.length()-1;i>=0;i--)
		{
			RevString= RevString+S.charAt(i);
		}
		System.out.println(RevString);
		
		if (S.equals(RevString))
		{
			System.out.println("Then String is Palindrome");
		}
		else
		{
			System.out.println("Then String is not Palindrome");
		}
	}

}
