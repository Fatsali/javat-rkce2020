package day10Stringmethod;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		//charAt() methodu belli index deki characteri return eder.
		String str1="cimbombom";
		// str 1 in 4. index indeki characteri bulan kodu yaz�n.
		System.out.println(str1.charAt(4));// index i 4 olan character o harfidir bu y�zden ekrana o yazd�r�r.
		System.out.println(str1.charAt(0));//index 0 ilk harftir bu y�zden c return eder.
		System.out.println(str1.charAt(8));// olmayan bir index le �al��maya �al���rsan�z "Exception" al�rs�n�z.
		                                  // bu da b�y�k bir hata yapt�n�z demektir.
		//length() methodu Stringin i�inde ka� karakter oldu�unu verir. 
		System.out.println(str1.length());// index  saymaya 0 dan ba�lar fakat length saymaya 1 den ba�lar.
		
		// soru :son index i 9 olan bir Stringin length i ka�t�r
		//cevap :9+1=10 olur
		
		
		// kullan�c�dan ismini girmesini isteyin 
		// isminin son harfini ekrana yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi giriniz");
		String isim=scan.nextLine();
		
		int length=isim.length();
		System.out.println(isim.charAt(length-1));
		
		
		
		scan.close();
		
		
	}

}
