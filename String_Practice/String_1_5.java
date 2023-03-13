package String_Practice;

public class String_1_5 
{

	public static void main(String[] args) 
	{
	
//		char a1= 'H';
//		char a2= 'a';
//		char a3= 'r';
//		char a4= 'i';
//		char a5= '1';
//		String S="";
//		
//		S= S+a1+a2+a3+a4+a5;
//		
//		System.out.println(S);
		
//		String a= "Hari123";
//		String b= "Hari123";
//				String c= new String("hari123");
//				String d= new String("Hari123");
//				
//				System.out.println(a);
//				System.out.println(b);
//				System.out.println(c);
//				System.out.println(d);
		
		
		String p = "Miraj Maharashtra";
		String q = "Miraj Maharashtra";
		String r = "Miraj M";
		String s = "miraj maharashtra";
		String t = " ";
		System.out.println(p.length());
		
		System.out.println("====================");
		
		System.out.println(p.toUpperCase());
		
		System.out.println("====================");
		
		System.out.println(p.toLowerCase());
		
		System.out.println("====================");
		
		System.out.println(p.equals(q));
		
		System.out.println("====================");
		
		System.out.println(p.equals(r));
		
		System.out.println("====================");
		
		System.out.println(p.equals(s));
		
		System.out.println("====================");
		
		System.out.println(p.toLowerCase().equals(s));
		System.out.println(p.equalsIgnoreCase(s));
		
		System.out.println("====================");
		
		System.out.println(p.contains(r));
		
		System.out.println("====================");
		
		System.out.println(t.isEmpty());
	}

}
