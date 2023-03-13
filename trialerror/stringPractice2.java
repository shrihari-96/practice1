package trialerror;
public class stringPractice2 {

	public static void main(String[] args) {
	String A = "shrihari bartakke";
	
	String B = " SHRIHARI BARTAKKE";
	String C = "virat";
	String D = "Anushka";
	
	System.out.println(A.substring(4,8));
	System.out.println(A.concat(B));
//	System.out.println(C.substring(0,3).concat(D.substring(2)));
//	System.out.println(D.substring(2));
//	System.out.println(A.concat());
	
	//==================================
	String E = C.substring(0,3);
	String F = D.substring(2);
	//==================================
	boolean G = A.equalsIgnoreCase(E);
	//====================================
	System.out.println(E.concat(F));
	System.out.println(E+F);
	System.out.println(C.substring(0,3).concat(D.substring(2)));
	//===================================
	}

}
