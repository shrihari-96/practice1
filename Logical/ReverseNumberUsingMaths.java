package Logical;

public class ReverseNumberUsingMaths 
{

	public static void main(String[] args) 
	{
		int xyz = 451;
		int revNumber= 0;
		for (int i=xyz; i>=1;i=i/10)				// 451, 45, 4
		{
			int remainder = i%10;					// 1,5, 4
			revNumber = revNumber*10+remainder;		// 1, 15, 154
		}
		
		System.out.println(revNumber);
	}

}
