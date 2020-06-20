package day10Stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
		// 1.method indexof() methodu Stringin içindeki characterin yerini belirlemek için kullanýlýr
		String str1="Javva Word";
		System.out.println(str1.indexOf('v'));//ekrana iki yazdýrýr çünkü index sayýmý 0 dan baþlar.
		System.out.println(str1.indexOf('W'));//Ekrana 5 yazdýrýr.space java için bir character dir.
		System.out.println(str1.indexOf('w'));//java index bulamaz çünkü java case sensitive dir küçük w jazýda yok
		                                      //java karakter bulamayýnca -1 return eder.
		System.out.println(str1.indexOf('a'));//ekrana bir yazdýrýr.tekrarlanan harfleri sorarsanýz ilk harfýn numarasýný verir.
		
		//indexof() methodu 2. versiyonu
		System.out.println(str1.indexOf('a',2));//Stringdeki ikinci 'a' characterinin index ini bulunuz
		                                        //ekrana 3 yazdýrmalý.
		System.out.println(str1.indexOf('a',4));//ekrana 4 yazdýrýr.
		System.out.println(str1.indexOf('a',1));
		System.out.println(str1.indexOf('a',5));
		//Alamanya Stringindeki ikinci a karakterinin index ini bulunuz
		String str2="Alamanya";
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf('a',3));
		//indexof() methodunun 3.versiyonu
		String str3="Missisippi";
		System.out.println(str3.indexOf("is"));//ilk is Stringini bulur ve ilk harfin index ini retörn eder.
		                                       //i harfinin indexi olan 1 i retörn eder.
		
		System.out.println(str3.indexOf("si"));
		
		
		
		
	}

}
