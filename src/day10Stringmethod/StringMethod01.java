package day10Stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
		// 1.method indexof() methodu Stringin i�indeki characterin yerini belirlemek i�in kullan�l�r
		String str1="Javva Word";
		System.out.println(str1.indexOf('v'));//ekrana iki yazd�r�r ��nk� index say�m� 0 dan ba�lar.
		System.out.println(str1.indexOf('W'));//Ekrana 5 yazd�r�r.space java i�in bir character dir.
		System.out.println(str1.indexOf('w'));//java index bulamaz ��nk� java case sensitive dir k���k w jaz�da yok
		                                      //java karakter bulamay�nca -1 return eder.
		System.out.println(str1.indexOf('a'));//ekrana bir yazd�r�r.tekrarlanan harfleri sorarsan�z ilk harf�n numaras�n� verir.
		
		//indexof() methodu 2. versiyonu
		System.out.println(str1.indexOf('a',2));//Stringdeki ikinci 'a' characterinin index ini bulunuz
		                                        //ekrana 3 yazd�rmal�.
		System.out.println(str1.indexOf('a',4));//ekrana 4 yazd�r�r.
		System.out.println(str1.indexOf('a',1));
		System.out.println(str1.indexOf('a',5));
		//Alamanya Stringindeki ikinci a karakterinin index ini bulunuz
		String str2="Alamanya";
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf('a',3));
		//indexof() methodunun 3.versiyonu
		String str3="Missisippi";
		System.out.println(str3.indexOf("is"));//ilk is Stringini bulur ve ilk harfin index ini ret�rn eder.
		                                       //i harfinin indexi olan 1 i ret�rn eder.
		
		System.out.println(str3.indexOf("si"));
		
		
		
		
	}

}
