package Arraypractice1;

public class ArrayPractice {
	static int A=12;

	public static void main(String[] args) 
	{
		int[][] ABC= {{123, 345, 2376, 763, 756},
				{365, 374, 3723, 283, 382},
				{2653,3753,38763,2863,3873},
				{1233,1343,343244,24532,123442},
				{123, 12334, 3342, 32331, 24124}
		};
		System.out.println("Length of Array is "+ABC.length);
		
		
//		for (int i=0; i<ABC.length;i++)
//		{
//			for (int j=0;j<ABC.length;j++)
//			{
//			System.out.print(ABC[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i=0; i<3;i++)
		{
			for (int j=0;j<5;j++)
			{  
			System.out.print(ABC[i][j] + " ");
			}
			System.out.println();
		}

	}

}
