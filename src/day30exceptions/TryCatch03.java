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
	
	//throw ile throws keywordlerinin farký
	//1 trow method body si içinde yazýlýr. throws method parantezi ile curly brace arasýna yazýlýr.
	//2 trow u method body si içinde exception almak istediðimiz yerde kullanabiliriz. Throws ise mecburen method isminden sonra 
	// bir kez kullanýlýr
	//3.1 throw   sadece 1 tane exception üretirsiniz.1 throws ile birden çok exception üretebilirsiniz
	//yani"throws NullPointerException,AritmaticException" mümkün 
	//4) throw icin syntax ==> throw new NullPointerException;
		//   throws icin syntax ==> throws NullPointerException

}
}
