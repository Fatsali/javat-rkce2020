package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		System.out.println(exceptions());

	}
	@SuppressWarnings("finally")
public static String exceptions () {
	String result="";
	String v=null;
	try {
		try {
			result=result+ "before";
			v.length();
			result=result+ "after";
		}catch(NullPointerException e) {
			result=result+"catch";
			throw new RuntimeException();
		}finally {
			result=result+"finally";
			throw new Exception();
		}
	}catch(Exception e) {
		result=result+"done";
	}
	return result;
	
	//throw ile throws keywordlerinin fark�
	//1 trow method body si i�inde yaz�l�r. throws method parantezi ile curly brace aras�na yaz�l�r.
	//2 trow u method body si i�inde exception almak istedi�imiz yerde kullanabiliriz. Throws ise mecburen method isminden sonra 
	// bir kez kullan�l�r
	//3.1 throw   sadece 1 tane exception �retirsiniz.1 throws ile birden �ok exception �retebilirsiniz
	//yani"throws NullPointerException,AritmaticException" m�mk�n 
	//4) throw icin syntax ==> throw new NullPointerException;
		//   throws icin syntax ==> throws NullPointerException

}
}
