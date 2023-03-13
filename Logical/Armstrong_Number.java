package Logical;

public class Armstrong_Number 
{

	public static void main(String [] args)
	{
		int xyz = 370;
		int cubeNumber=0;
		for (int i=xyz; i>=1;i=i/10)				// 
		{
			int remainder = i%10;					// 
			cubeNumber= cubeNumber+ (remainder * remainder * remainder);										//
		}
		
		System.out.println(cubeNumber);
		
		if (cubeNumber == xyz)
		{
			System.out.println("Given Number is Armstrong Number");
		}
		else
		{
			System.out.println("Given Number is not an Armstrong Number");
		}
	}
}
