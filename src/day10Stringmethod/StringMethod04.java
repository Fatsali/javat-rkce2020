package day10Stringmethod;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains()methodu bir Stringin içinde bir characterin olup olmadýðýný kontrol eder
		// eðer bu character Stringin içinde varsa True yoksa false return eder
	String str1="karakartal";
	System.out.println(str1.contains("m"));// contains methodunun içine her zaman String koyun
	System.out.println(str1.contains("kar"));

	// trim() methodu bir Stringin bas ve sonundaki boþluklarý siler." Ali " ==>"Ali"
	//trim() methodu sadece baþ ve sondaki boþluklarý siler aradaki boþluklarý silmez
	String str2=" Ali Can      ";
	System.out.println("trim() kullanmadan önce:"+str2);
	System.out.println("trim() kullanmadan önce:"+str2.trim());	
	
	
	//isEmpty() bir stringin içinde character olup olmadýðýna bakar.
	// character yoksa true varsa false return eder.
	String str3="Ali";
	System.out.println(str3.isEmpty());
	String str4=" ";
	System.out.println(str4.isEmpty());
	String str5="";
	System.out.println(str5.isEmpty());		
		//isEmpty true çýkarsa length 0 demektir.	
			
	}

}
