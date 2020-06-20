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
		// Stringe null atandýðý zaman veya instance veriable ye deðer atanmadýðý zaman length methodu çalýþmaz. ve NullPointerException alirsýnýz.
// aþaðýdaki iki satýrdaki kod da exception verir. 
		//		String n=null;
//		
//		System.out.println(n.length());
		
		
	}

}
