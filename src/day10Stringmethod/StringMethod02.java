package day10Stringmethod;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexof() methodu aradýðýnýz karakterin String içindeki son görünümünün indeksini return eder.
		
		//lastIndexOf methodu 1. verisiyonu
		
		String str1="Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));// ekrana 6 yazdýrýrçünkü i characterinin
		                                          // strings içinde son görünümün indexi 6 dýr.
		
		System.out.println(str1.lastIndexOf('r'));//ekrana 9 yazdýrýr.
		//lastIndexOf methodu 2. versiyonu
		
		System.out.println(str1.lastIndexOf('i', 7));// ilk 7 indexin  içinde i harfinin son görümünün index ini retörn eder.
		
		System.out.println(str1.lastIndexOf('i', 5));
		
		//lastIndexOf Methodu 3. versiyon
		String str2="rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));// Stringin içindeki ri nin son görünümünü bulacak. son ri deki r harfinin index ini retörn edecek.
		
		
		

	}

}
