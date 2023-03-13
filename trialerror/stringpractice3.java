package trialerror;

public class stringpractice3 {

	public static void main(String[] args) {
		String A = "Prafful Prakash Pise";
//		String B = "prafful pise";
	//System.out.println(A.replace("Prafful", "Prajkta"));
		
		String C = "ShrihariDnyaneshwarBartakke";
		System.out.println("********************");
		//System.out.println(C.length());
		String D = C.substring(0,8);
		String E = C.substring(8,19);
		String F = C.substring(19,27);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println("********************");
		
		String[] ABC = A.split(" ");
		for( int i = 0;i<ABC.length;i++) 
		{
			System.out.println(ABC[i]);
		}
		
	}

}
