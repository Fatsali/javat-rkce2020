package day10Stringmethod;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexof() methodu arad���n�z karakterin String i�indeki son g�r�n�m�n�n indeksini return eder.
		
		//lastIndexOf methodu 1. verisiyonu
		
		String str1="Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));// ekrana 6 yazd�r�r��nk� i characterinin
		                                          // strings i�inde son g�r�n�m�n indexi 6 d�r.
		
		System.out.println(str1.lastIndexOf('r'));//ekrana 9 yazd�r�r.
		//lastIndexOf methodu 2. versiyonu
		
		System.out.println(str1.lastIndexOf('i', 7));// ilk 7 indexin  i�inde i harfinin son g�r�m�n�n index ini ret�rn eder.
		
		System.out.println(str1.lastIndexOf('i', 5));
		
		//lastIndexOf Methodu 3. versiyon
		String str2="rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));// Stringin i�indeki ri nin son g�r�n�m�n� bulacak. son ri deki r harfinin index ini ret�rn edecek.
		
		
		

	}

}
