package Logical;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int xyz = 2;
		int count=0;
		for (int i=3;i<7;i++)
		{
			if (xyz%i==0)
			{
				count++;
				break;
			}	
		}
		
		if (count==1)
		{
			System.out.println("Given Number is not Prime");
		}
		else
		{
			System.out.println("Given Number is Prime");
		}
	}

}
