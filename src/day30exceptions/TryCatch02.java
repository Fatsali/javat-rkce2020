package day30exceptions;

public class TryCatch02 {
	static String m;

	public static void main(String[] args) {
		String s="";
		System.out.println(s.length());//0
		try {
			s+="t";
		}catch(Exception e) {
		s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		System.out.println(s);
		// Stringe null atand��� zaman veya instance veriable ye de�er atanmad��� zaman length methodu �al��maz. ve NullPointerException alirs�n�z.
// a�a��daki iki sat�rdaki kod da exception verir. 
		//		String n=null;
//		
//		System.out.println(n.length());
		
		
	}

}
