package day10Stringmethod;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains()methodu bir Stringin i�inde bir characterin olup olmad���n� kontrol eder
		// e�er bu character Stringin i�inde varsa True yoksa false return eder
	String str1="karakartal";
	System.out.println(str1.contains("m"));// contains methodunun i�ine her zaman String koyun
	System.out.println(str1.contains("kar"));

	// trim() methodu bir Stringin bas ve sonundaki bo�luklar� siler." Ali " ==>"Ali"
	//trim() methodu sadece ba� ve sondaki bo�luklar� siler aradaki bo�luklar� silmez
	String str2=" Ali Can      ";
	System.out.println("trim() kullanmadan �nce:"+str2);
	System.out.println("trim() kullanmadan �nce:"+str2.trim());	
	
	
	//isEmpty() bir stringin i�inde character olup olmad���na bakar.
	// character yoksa true varsa false return eder.
	String str3="Ali";
	System.out.println(str3.isEmpty());
	String str4=" ";
	System.out.println(str4.isEmpty());
	String str5="";
	System.out.println(str5.isEmpty());		
		//isEmpty true ��karsa length 0 demektir.	
			
	}

}
