package day10Stringmethod;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		//charAt() methodu belli index deki characteri return eder.
		String str1="cimbombom";
		// str 1 in 4. index indeki characteri bulan kodu yazýn.
		System.out.println(str1.charAt(4));// index i 4 olan character o harfidir bu yüzden ekrana o yazdýrýr.
		System.out.println(str1.charAt(0));//index 0 ilk harftir bu yüzden c return eder.
		System.out.println(str1.charAt(8));// olmayan bir index le çalýþmaya çalýþýrsanýz "Exception" alýrsýnýz.
		                                  // bu da büyük bir hata yaptýnýz demektir.
		//length() methodu Stringin içinde kaç karakter olduðunu verir. 
		System.out.println(str1.length());// index  saymaya 0 dan baþlar fakat length saymaya 1 den baþlar.
		
		// soru :son index i 9 olan bir Stringin length i kaçtýr
		//cevap :9+1=10 olur
		
		
		// kullanýcýdan ismini girmesini isteyin 
		// isminin son harfini ekrana yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim=scan.nextLine();
		
		int length=isim.length();
		System.out.println(isim.charAt(length-1));
		
		
		
		scan.close();
		
		
	}

}
